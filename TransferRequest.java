public class TransferRequest {
    private String sourceBucket;
    private String destinationBucket;
    private String objectKey;

    // Add any additional fields if required, such as metadata, encryption settings, etc.

    public TransferRequest() {
    }

    public TransferRequest(String sourceBucket, String destinationBucket, String objectKey) {
        this.sourceBucket = sourceBucket;
        this.destinationBucket = destinationBucket;
        this.objectKey = objectKey;
    }

    public String getSourceBucket() {
        return sourceBucket;
    }

    public void setSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
    }

    public String getDestinationBucket() {
        return destinationBucket;
    }

    public void setDestinationBucket(String destinationBucket) {
        this.destinationBucket = destinationBucket;
    }

    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }
}
