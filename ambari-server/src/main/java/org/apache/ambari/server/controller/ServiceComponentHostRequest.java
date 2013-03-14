/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.controller;

import java.util.Map;

public class ServiceComponentHostRequest {

  private String clusterName; // REF

  private String serviceName;

  private String componentName;

  private String hostname;

  // Config type -> version mapping
  private Map<String, String> configVersions; // CREATE/UPDATE

  private String desiredState; // CREATE/UPDATE

  private String desiredStackId; // UPDATE

  public ServiceComponentHostRequest(String clusterName,
                                     String serviceName,
                                     String componentName, String hostname,
                                     Map<String, String> configVersions, String desiredState) {
    super();
    this.clusterName = clusterName;
    this.serviceName = serviceName;
    this.componentName = componentName;
    this.hostname = hostname;
    this.configVersions = configVersions;
    this.desiredState = desiredState;
  }

  /**
   * @return the serviceName
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * @param serviceName the serviceName to set
   */
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * @return the componentName
   */
  public String getComponentName() {
    return componentName;
  }

  /**
   * @param componentName the componentName to set
   */
  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }

  /**
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * @param hostname the hostname to set
   */
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * @return the configVersions
   */
  public Map<String, String> getConfigVersions() {
    return configVersions;
  }

  /**
   * @param configVersions the configVersions to set
   */
  public void setConfigVersions(Map<String, String> configVersions) {
    this.configVersions = configVersions;
  }

  /**
   * @return the desiredState
   */
  public String getDesiredState() {
    return desiredState;
  }

  /**
   * @param desiredState the desiredState to set
   */
  public void setDesiredState(String desiredState) {
    this.desiredState = desiredState;
  }

  /**
   * @return the desiredStackId
   */
  public String getDesiredStackId() {
    return desiredStackId;
  }

  /**
   * @param desiredStackId the desiredStackId to set
   */
  public void setDesiredStackId(String desiredStackId) {
    this.desiredStackId = desiredStackId;
  }

  /**
   * @return the clusterName
   */
  public String getClusterName() {
    return clusterName;
  }

  /**
   * @param clusterName the clusterName to set
   */
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{"
        + " clusterName=" + clusterName
        + ", serviceName=" + serviceName
        + ", componentName=" + componentName
        + ", hostname=" + hostname
        + ", desiredState=" + desiredState
        + ", desiredStackId=" + desiredStackId
        + "}");
    return sb.toString();
  }
}
