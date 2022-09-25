package com.example.restaurant.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchImageReq {

    private String query = ""; //검색 원하는 문자열

    private int display = 1; //출력 건수 조절

    private int start = 1; //검색 시작 위치로 1만 가능

    private String sort = "sim"; //정렬 옵션(sim은 유사도 순, date는 날짜 순)
    private String filter = "all";

    public MultiValueMap<String, String> toMultValueMap() {
        var map = new LinkedMultiValueMap<String, String>();

        map.add("query", query);
        map.add("display", String.valueOf(display));
        map.add("start", String.valueOf(start));
        map.add("sort", sort);
        map.add("filter", filter);

        return map;
    }
}
