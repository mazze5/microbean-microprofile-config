/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil; coding: utf-8-unix -*-
 *
 * Copyright © 2018–2019 microBean™.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.microbean.microprofile.config.cdi;

import javax.enterprise.util.AnnotationLiteral;

import org.eclipse.microprofile.config.inject.ConfigProperty;

final class ConfigPropertyLiteral extends AnnotationLiteral<ConfigProperty> implements ConfigProperty {
  
  private static final long serialVersionUID = 1L;
  
  static final ConfigProperty INSTANCE = new ConfigPropertyLiteral();
  
  ConfigPropertyLiteral() {
    super();
  }
  
  @Override
  public final String name() {
    return "";
  }
  
  @Override
  public final String defaultValue() {
    return "";
  }

}
