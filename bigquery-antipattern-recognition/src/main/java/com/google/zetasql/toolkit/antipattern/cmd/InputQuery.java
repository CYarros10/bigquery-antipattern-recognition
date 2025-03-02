/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zetasql.toolkit.antipattern.cmd;

public class InputQuery {

  private String query;
  private String queryIdentifier;
  private String projectId;
  private float totalSlotMs;

  public InputQuery(String query, String queryIdentifier) {
    this.query = query;
    this.queryIdentifier = queryIdentifier;
  }

  public InputQuery(String query, String jobId, float totalSlotMs) {
    this.query = query;
    this.queryIdentifier = jobId;
    this.totalSlotMs = totalSlotMs;
  }

  public InputQuery(String query, String jobId, String projectId, float totalSlotMs) {
    this.projectId = projectId;
    this.query = query;
    this.queryIdentifier = jobId;
    this.totalSlotMs = totalSlotMs;;
  }

  public String getProjectId() {
    return projectId;
  }

  public String getQuery() {
    return query;
  }

  public String getQueryId() {
    return queryIdentifier;
  }

  public float getTotalSlotMs() {
    return totalSlotMs;
  }
}
