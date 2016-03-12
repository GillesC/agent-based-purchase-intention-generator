/**
 * This class will represent a profile of an agent
 * These parameters will contribute to the consummation decision
 */
public class AgentProfile {

    private double selfPerception;          // how sensitive is a consumer to external attributes (price reductions)
    private double priceQualiteyPerception; // how sensitive is a consumer to too low of a price reduction

    private double greenPurchaseIntention;  // how sensitive is the consumer to buying green products
        private double greenAwereness;      // parameter 1: how 'green' is the consumer
                                            // other valuable parameters are in Shop and Product Profiles

    private double needRecognizing;         // how sensitive is the consumer to buying products
                                            // this will depend also on the category of the product



    /* setters and getters */
    public double getGreenAwereness() {
        return greenAwereness;
    }

    public void setGreenAwereness(double greenAwereness) {
        this.greenAwereness = greenAwereness;
    }

    public double getSelfPerception() {
        return selfPerception;
    }

    public void setSelfPerception(double selfPerception) {
        this.selfPerception = selfPerception;
    }

    public double getPriceQualiteyPerception() {
        return priceQualiteyPerception;
    }

    public void setPriceQualiteyPerception(double priceQualiteyPerception) {
        this.priceQualiteyPerception = priceQualiteyPerception;
    }

    public double getGreenPurchaseIntention() {
        return greenPurchaseIntention;
    }

    public void setGreenPurchaseIntention(double greenPurchaseIntention) {
        this.greenPurchaseIntention = greenPurchaseIntention;
    }

    public double getNeedRecognizing() {
        return needRecognizing;
    }

    public void setNeedRecognizing(double needRecognizing) {
        this.needRecognizing = needRecognizing;
    }
}
