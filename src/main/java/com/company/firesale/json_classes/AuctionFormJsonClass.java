package com.company.firesale.json_classes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuctionFormJsonClass {
    @NotEmpty
    @NotNull
    private String title;
    @NotEmpty
    @NotNull
    private String description;
    @NotNull
    private LocalDateTime closingTime;
    @NotNull
    private Double startUpPrice;
    @NotNull
    private Double buyOutPrice;
    @NotEmpty
    @NotNull
    private String category;

    private String[] images;
}
