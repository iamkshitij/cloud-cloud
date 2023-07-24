import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransferDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transferId;
    private String sourceBucket;
    private String destinationBucket;
    private String objectKey;
    private String uploadId;
    private int currentPart;
    private int totalParts;

    // Constructors, getters, and setters
}
