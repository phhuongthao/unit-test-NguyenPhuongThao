package com.junit1;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentAnalyzerTest {
    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // Kiểm thử countExcellentStudents
    @Test
    public void testCountExcellentStudents_MixedValidAndInvalid() {
        // Danh sách có điểm hợp lệ và không hợp lệ
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        // Danh sách toàn điểm hợp lệ, có 3 điểm giỏi
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 8.5)));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        // Danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        // Danh sách chứa điểm biên (0.0 và 10.0)
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0)));
        // Danh sách chỉ chứa điểm 0.0 (không giỏi)
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(0.0, 0.0)));
    }

    @Test
    public void testCountExcellentStudents_OnlyInvalid() {
        // Danh sách chỉ chứa điểm không hợp lệ
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-1.0, 11.0)));
    }

    // Kiểm thử calculateValidAverage
    @Test
    public void testCalculateValidAverage_MixedValidAndInvalid() {
        // Điểm trung bình của 9.0, 8.5, 7.0 = (9.0 + 8.5 + 7.0)/3 = 8.17
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        // Điểm trung bình của 8.0, 9.0, 8.5 = (8.0 + 9.0 + 8.5)/3 = 8.5
        assertEquals(8.5, analyzer.calculateValidAverage(Arrays.asList(8.0, 9.0, 8.5)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        // Danh sách rỗng
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        // Điểm trung bình của 0.0, 10.0 = (0.0 + 10.0)/2 = 5.0
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.01);
        // Điểm trung bình của 0.0, 0.0 = (0.0 + 0.0)/2 = 0.0
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 0.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_OnlyInvalid() {
        // Danh sách chỉ chứa điểm không hợp lệ
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0)), 0.01);
    }
}
