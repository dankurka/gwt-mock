/*
 * Copyright 2012 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtmock.client;

import com.google.gwt.user.client.ui.HasAlignment;

public class MockHasAlignment implements HasAlignment {

  protected HorizontalAlignmentConstant horizontalAlignmentConstant;

  protected VerticalAlignmentConstant verticalAlignmentConstant;

  /*
   * (non-Javadoc)
   * 
   * @see com.google.gwt.user.client.ui.HasHorizontalAlignment#getHorizontalAlignment ()
   */
  @Override
  public HorizontalAlignmentConstant getHorizontalAlignment() {
    return horizontalAlignmentConstant;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.google.gwt.user.client.ui.HasHorizontalAlignment#setHorizontalAlignment
   * (com.google.gwt.user.client.ui.HasHorizontalAlignment. HorizontalAlignmentConstant)
   */
  @Override
  public void setHorizontalAlignment(HorizontalAlignmentConstant align) {
    this.horizontalAlignmentConstant = align;

  }

  /*
   * (non-Javadoc)
   * 
   * @see com.google.gwt.user.client.ui.HasVerticalAlignment#getVerticalAlignment()
   */
  @Override
  public VerticalAlignmentConstant getVerticalAlignment() {
    return verticalAlignmentConstant;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.google.gwt.user.client.ui.HasVerticalAlignment#setVerticalAlignment(com.google.gwt.user
   * .client.ui.HasVerticalAlignment.VerticalAlignmentConstant)
   */
  @Override
  public void setVerticalAlignment(VerticalAlignmentConstant align) {
    this.verticalAlignmentConstant = align;

  }

}
