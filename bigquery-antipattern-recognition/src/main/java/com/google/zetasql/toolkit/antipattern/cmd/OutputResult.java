package com.google.zetasql.toolkit.antipattern.cmd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OutputResult {
    private String jobId;
    private String query;
    private Float totalSlotMs;
    private List<Map<String, String>> recommendation;

    public OutputResult(String jobId, String query, Float totalSlotMs, List<Map<String, String>> recommendation) {
        this.jobId = jobId;
        this.query = query;
        this.totalSlotMs = totalSlotMs;
        this.recommendation = recommendation;
    }

    public String getJobId() {
        return jobId;
    }

    public String getQuery() {
        return query;
    }

    public Float getTotalSlotMs() {
        return totalSlotMs;
    }

    public List<RecommendOutput> getListRecommend() {
        List<RecommendOutput> ListRecommendOutput = new ArrayList<>();
        for (Map<String, String> rec : recommendation) {
            ListRecommendOutput.add(new RecommendOutput(rec.get("name"), rec.get("description")));
        }
        return ListRecommendOutput;
    }
}

