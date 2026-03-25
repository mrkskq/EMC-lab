package mk.ukim.finki.emclab.model.dto;

import mk.ukim.finki.emclab.model.domain.ActivityLog;

import java.time.LocalDateTime;

public record DisplayActivityLogDto(
        String bookName,
        LocalDateTime eventTime,
        String eventType
) {
    public static DisplayActivityLogDto from(ActivityLog log) {
        return new DisplayActivityLogDto(
                log.getBookName(),
                log.getEventTime(),
                log.getEventType()
        );
    }
}