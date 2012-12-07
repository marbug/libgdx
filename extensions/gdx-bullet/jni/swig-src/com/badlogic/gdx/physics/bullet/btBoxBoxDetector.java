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

public class btBoxBoxDetector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btBoxBoxDetector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btBoxBoxDetector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btBoxBoxDetector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_box1(btBoxShape value) {
    gdxBulletJNI.btBoxBoxDetector_m_box1_set(swigCPtr, this, btBoxShape.getCPtr(value), value);
  }

  public btBoxShape getM_box1() {
    long cPtr = gdxBulletJNI.btBoxBoxDetector_m_box1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBoxShape(cPtr, false);
  }

  public void setM_box2(btBoxShape value) {
    gdxBulletJNI.btBoxBoxDetector_m_box2_set(swigCPtr, this, btBoxShape.getCPtr(value), value);
  }

  public btBoxShape getM_box2() {
    long cPtr = gdxBulletJNI.btBoxBoxDetector_m_box2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBoxShape(cPtr, false);
  }

  public btBoxBoxDetector(btBoxShape box1, btBoxShape box2) {
    this(gdxBulletJNI.new_btBoxBoxDetector(btBoxShape.getCPtr(box1), box1, btBoxShape.getCPtr(box2), box2), true);
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw, boolean swapResults) {
    gdxBulletJNI.btBoxBoxDetector_getClosestPoints__SWIG_0(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw, swapResults);
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw) {
    gdxBulletJNI.btBoxBoxDetector_getClosestPoints__SWIG_1(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw);
  }

}
