public enum LogLevel {
    TRACE (1),
    DEBUG (2),
    INFO (4),
    WARNING (5),
    ERROR (6),
    FATAL (42),
    UNKNOWN (0);

    private int logNo;

    LogLevel(int logNo) {
        this.logNo = logNo;
    }

    public int getLogNo() {
        return this.logNo;
    }
}

public class LogsLogsLogs {
    private String logLine;

    public LogsLogsLogs(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return switch (logLine.substring(1, 4)) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return getLogLevel().getLogNo() + ":" + logLine.substring(7);
    }
}