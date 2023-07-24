@RestController
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping("/transfer")
    public ResponseEntity<String> initiateTransfer(@RequestBody TransferRequest request) {
        String transferId = transferService.initiateTransfer(request);
        return ResponseEntity.ok(transferId);
    }

    @PostMapping("/transfer/{transferId}/pause")
    public ResponseEntity<String> pauseTransfer(@PathVariable String transferId) {
        transferService.pauseTransfer(transferId);
        return ResponseEntity.ok("Transfer paused successfully.");
    }

    @PostMapping("/transfer/{transferId}/resume")
    public ResponseEntity<String> resumeTransfer(@PathVariable String transferId) {
        transferService.resumeTransfer(transferId);
        return ResponseEntity.ok("Transfer resumed successfully.");
    }
}
