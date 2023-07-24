public class TransferDetails {
    private String transferId;
    private String sourceBucket;
    private String destinationBucket;
    private String objectKey;
    private String uploadId;
    private int currentPart;
    private int totalParts;

    public TransferDetails() {
    }

    public TransferDetails(String transferId, String sourceBucket, String destinationBucket, String objectKey, String uploadId, int currentPart, int totalParts) {
        this.transferId = transferId;
        this.sourceBucket = sourceBucket;
        this.destinationBucket = destinationBucket;
        this.objectKey = objectKey;
        this.uploadId = uploadId;
        this.currentPart = currentPart;
        this.totalParts = totalParts;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
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

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public int getCurrentPart() {
        return currentPart;
    }

    public void setCurrentPart(int currentPart) {
        this.currentPart = currentPart;
    }

    public int getTotalParts() {
        return totalParts;
    }

    public void setTotalParts(int totalParts) {
        this.totalParts = totalParts;
    }
}
