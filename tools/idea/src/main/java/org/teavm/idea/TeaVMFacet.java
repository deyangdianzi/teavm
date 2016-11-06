/*
 *  Copyright 2016 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.idea;

import com.intellij.facet.Facet;
import com.intellij.openapi.module.Module;
import org.jetbrains.annotations.NotNull;

public class TeaVMFacet extends Facet<TeaVMFacetConfiguration> {
    public TeaVMFacet(@NotNull Module module, @NotNull String name, @NotNull TeaVMFacetConfiguration configuration) {
        super(TeaVMFacetType.getInstance(), module, name, configuration, null);
    }
}