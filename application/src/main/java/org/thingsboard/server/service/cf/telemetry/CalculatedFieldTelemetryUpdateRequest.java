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
package org.thingsboard.server.service.cf.telemetry;

import org.thingsboard.server.common.data.id.CalculatedFieldId;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.kv.KvEntry;
import org.thingsboard.server.service.cf.ctx.state.CalculatedFieldCtx;

import java.util.List;
import java.util.Map;

public interface CalculatedFieldTelemetryUpdateRequest {

    TenantId getTenantId();

    EntityId getEntityId();

    List<? extends KvEntry> getKvEntries();

    List<CalculatedFieldId> getPreviousCalculatedFieldIds();

    Map<String, KvEntry> getMappedTelemetry(CalculatedFieldCtx ctx, EntityId referencedEntityId);

}
