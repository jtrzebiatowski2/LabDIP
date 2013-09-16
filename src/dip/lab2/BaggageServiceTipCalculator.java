package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    //These varaiables should be able to be changed and not set Final
    private static double GOOD_RATE = 0.20;
    private static double FAIR_RATE = 0.15;
    private static double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;

        @Override
        public void setServiceRating(ServiceQuality q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public TipCalculator.ServiceQuality getServiceRating() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }

    @Override
    public double calculateTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }
    
    private TipCalculator.ServiceQuality serviceQuality;

    
    public TipCalculator.ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
