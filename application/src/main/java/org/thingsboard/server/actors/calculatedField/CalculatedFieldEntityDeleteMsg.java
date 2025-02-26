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
package org.thingsboard.server.actors.calculatedField;

import lombok.Data;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.msg.MsgType;
import org.thingsboard.server.common.msg.ToCalculatedFieldSystemMsg;
import org.thingsboard.server.common.msg.queue.TbCallback;

@Data
public class CalculatedFieldEntityDeleteMsg implements ToCalculatedFieldSystemMsg {

    private final TenantId tenantId;
    private final EntityId entityId;
    private final TbCallback callback;

    public CalculatedFieldEntityDeleteMsg(TenantId tenantId,
                                          EntityId entityId,
                                          TbCallback callback) {
        this.tenantId = tenantId;
        this.entityId = entityId;
        this.callback = callback;
    }

    @Override
    public MsgType getMsgType() {
        return MsgType.CF_ENTITY_DELETE_MSG;
    }
}
