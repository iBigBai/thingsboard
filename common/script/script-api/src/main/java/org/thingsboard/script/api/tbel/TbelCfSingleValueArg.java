/**
 * Copyright © 2016-2025 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.script.api.tbel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TbelCfSingleValueArg implements TbelCfArg {

    private final long ts;
    private final Object value;

    @JsonCreator
    public TbelCfSingleValueArg(
            @JsonProperty("ts") long ts,
            @JsonProperty("value") Object value
    ) {
        this.ts = ts;
        this.value = value;
    }

    @Override
    public long memorySize() {
        return 8L; // TODO;
    }

    @Override
    public String getType() {
        return "SINGLE_VALUE";
    }

}
