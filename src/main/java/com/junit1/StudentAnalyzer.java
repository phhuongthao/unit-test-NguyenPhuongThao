package com.junit1;

import java.util.List;

public class StudentAnalyzer {
    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng, trả về 0
     */
    // Đếm số lượng sinh viên có điểm từ 8.0 đến 10.0 (điểm giỏi)
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10 && score >= 8) {
                count++;
            }
        }
        return count;
    }

    // Tính điểm trung bình của các điểm hợp lệ (0-10)
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        int count = 0;

        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                total += score;
                count++;
            }
        }

        return count == 0 ? 0.0 : total / count;
    }



}
