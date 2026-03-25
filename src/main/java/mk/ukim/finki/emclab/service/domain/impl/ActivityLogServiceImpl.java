package mk.ukim.finki.emclab.service.domain.impl;

import mk.ukim.finki.emclab.model.dto.DisplayActivityLogDto;
import mk.ukim.finki.emclab.model.dto.DisplayBookListDto;
import mk.ukim.finki.emclab.repository.ActivityLogRepository;
import mk.ukim.finki.emclab.service.domain.ActivityLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {

    private final ActivityLogRepository activityLogRepository;

    public ActivityLogServiceImpl(ActivityLogRepository activityLogRepository) {
        this.activityLogRepository = activityLogRepository;
    }

    @Override
    public Page<DisplayActivityLogDto> getAllActivityLogs(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return activityLogRepository.findAll(pageable).map(DisplayActivityLogDto::from);
    }
}
