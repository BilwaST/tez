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

package org.apache.tez.engine.newapi;

/**
 * Base class for all events generated within the Tez execution engine.
 * Used as the primary mode of communication between the AM, Inputs, Processors
 * and Outputs.
 */
public abstract class Event {

  public static enum EventType {
    SYSTEM,
    USER
  }

  private final EventType eventType;

  public Event(EventType eventType) {
    this.eventType = eventType;
  }

  public EventType getEventType() {
    return eventType;
  }
}
