/*
 * This file is part of "SnipSnap Radeox Rendering Engine".
 *
 * Copyright (c) 2002 Stephan J. Schmidt, Matthias L. Jugel
 * All Rights Reserved.
 *
 * Please visit http://radeox.org/ for updates and contact.
 *
 * --LICENSE NOTICE--
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * --LICENSE NOTICE--
 */

package examples;

import org.radeox.macro.BaseMacro;
import org.radeox.macro.parameter.MacroParameter;
import org.radeox.api.engine.context.InitialRenderContext;

import java.io.IOException;
import java.io.Writer;

public class InitialRenderContextHelloWorldMacro extends BaseMacro {
// cut:start-1
  private String name;

  public void setInitialContext(InitialRenderContext context) {
    super.setInitialContext(context);
    name = (String) context.get("hello.name");
  }

  public void execute(Writer writer, MacroParameter params)
    throws IllegalArgumentException, IOException {
    writer.write("hello "+name);
  }
// cut:end-1

  public String getName() {
    return "hello";
  }
}
