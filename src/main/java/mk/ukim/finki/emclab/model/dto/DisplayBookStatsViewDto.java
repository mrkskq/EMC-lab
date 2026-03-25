package mk.ukim.finki.emclab.model.dto;

import mk.ukim.finki.emclab.model.views.BookStatsView;

import java.util.List;

// lab2 - 5. za materialized view
public record DisplayBookStatsViewDto(
        String category,
        Long totalBooks,
        Long totalAvailableCopies,
        Long notGoodConditionBooks
) {

    public static DisplayBookStatsViewDto from(BookStatsView stats) {
        return new DisplayBookStatsViewDto(
                stats.getCategory(),
                stats.getTotalBooks(),
                stats.getTotalAvailableCopies(),
                stats.getNotGoodConditionBooks()
        );
    }

    public static List<DisplayBookStatsViewDto> from(List<BookStatsView> statsList) {
        return statsList
                .stream()
                .map(DisplayBookStatsViewDto::from)
                .toList();
    }
}
