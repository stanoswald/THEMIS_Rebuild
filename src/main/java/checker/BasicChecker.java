package checker;

import process.BGPMessage;
import process.DetectionResult;

public interface BasicChecker {
    DetectionResult hijackCheck(BGPMessage message);
}
