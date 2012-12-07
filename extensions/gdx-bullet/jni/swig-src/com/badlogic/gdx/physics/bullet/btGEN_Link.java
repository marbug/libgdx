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

public class btGEN_Link {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btGEN_Link(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btGEN_Link obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btGEN_Link(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btGEN_Link() {
    this(gdxBulletJNI.new_btGEN_Link__SWIG_0(), true);
  }

  public btGEN_Link(btGEN_Link next, btGEN_Link prev) {
    this(gdxBulletJNI.new_btGEN_Link__SWIG_1(btGEN_Link.getCPtr(next), next, btGEN_Link.getCPtr(prev), prev), true);
  }

  public btGEN_Link getNext() {
    long cPtr = gdxBulletJNI.btGEN_Link_getNext(swigCPtr, this);
    return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
  }

  public btGEN_Link getPrev() {
    long cPtr = gdxBulletJNI.btGEN_Link_getPrev(swigCPtr, this);
    return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
  }

  public boolean isHead() {
    return gdxBulletJNI.btGEN_Link_isHead(swigCPtr, this);
  }

  public boolean isTail() {
    return gdxBulletJNI.btGEN_Link_isTail(swigCPtr, this);
  }

  public void insertBefore(btGEN_Link link) {
    gdxBulletJNI.btGEN_Link_insertBefore(swigCPtr, this, btGEN_Link.getCPtr(link), link);
  }

  public void insertAfter(btGEN_Link link) {
    gdxBulletJNI.btGEN_Link_insertAfter(swigCPtr, this, btGEN_Link.getCPtr(link), link);
  }

  public void remove() {
    gdxBulletJNI.btGEN_Link_remove(swigCPtr, this);
  }

}
