/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCollisionShapeData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btCollisionShapeData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCollisionShapeData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btCollisionShapeData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_name(String value) {
    gdxBulletJNI.btCollisionShapeData_m_name_set(swigCPtr, this, value);
  }

  public String getM_name() {
    return gdxBulletJNI.btCollisionShapeData_m_name_get(swigCPtr, this);
  }

  public void setM_shapeType(int value) {
    gdxBulletJNI.btCollisionShapeData_m_shapeType_set(swigCPtr, this, value);
  }

  public int getM_shapeType() {
    return gdxBulletJNI.btCollisionShapeData_m_shapeType_get(swigCPtr, this);
  }

  public void setM_padding(String value) {
    gdxBulletJNI.btCollisionShapeData_m_padding_set(swigCPtr, this, value);
  }

  public String getM_padding() {
    return gdxBulletJNI.btCollisionShapeData_m_padding_get(swigCPtr, this);
  }

  public btCollisionShapeData() {
    this(gdxBulletJNI.new_btCollisionShapeData(), true);
  }

}
