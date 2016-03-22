/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * RPC调用错误
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-9")
public class ServiceException extends TException implements libthrift091.TBase<ServiceException, ServiceException._Fields>, java.io.Serializable, Cloneable, Comparable<ServiceException> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ServiceException");

  private static final libthrift091.protocol.TField ERROR_CODE_FIELD_DESC = new libthrift091.protocol.TField("errorCode", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField ERROR_MESSAGE_FIELD_DESC = new libthrift091.protocol.TField("errorMessage", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField DETAILS_FIELD_DESC = new libthrift091.protocol.TField("details", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField CALL_ID_FIELD_DESC = new libthrift091.protocol.TField("callId", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField REQUEST_ID_FIELD_DESC = new libthrift091.protocol.TField("requestId", libthrift091.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServiceExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServiceExceptionTupleSchemeFactory());
  }

  /**
   * 错误码
   * 
   * @see ErrorCode
   */
  public ErrorCode errorCode; // optional
  /**
   * 错误信息
   */
  public String errorMessage; // optional
  /**
   * 错误信息细节
   */
  public String details; // optional
  /**
   * RPC调用标识
   */
  public String callId; // optional
  /**
   * 请求标识
   */
  public String requestId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 错误码
     * 
     * @see ErrorCode
     */
    ERROR_CODE((short)1, "errorCode"),
    /**
     * 错误信息
     */
    ERROR_MESSAGE((short)2, "errorMessage"),
    /**
     * 错误信息细节
     */
    DETAILS((short)3, "details"),
    /**
     * RPC调用标识
     */
    CALL_ID((short)4, "callId"),
    /**
     * 请求标识
     */
    REQUEST_ID((short)5, "requestId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // ERROR_MESSAGE
          return ERROR_MESSAGE;
        case 3: // DETAILS
          return DETAILS;
        case 4: // CALL_ID
          return CALL_ID;
        case 5: // REQUEST_ID
          return REQUEST_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ERROR_CODE,_Fields.ERROR_MESSAGE,_Fields.DETAILS,_Fields.CALL_ID,_Fields.REQUEST_ID};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new libthrift091.meta_data.FieldMetaData("errorCode", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, ErrorCode.class)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new libthrift091.meta_data.FieldMetaData("errorMessage", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DETAILS, new libthrift091.meta_data.FieldMetaData("details", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CALL_ID, new libthrift091.meta_data.FieldMetaData("callId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_ID, new libthrift091.meta_data.FieldMetaData("requestId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ServiceException.class, metaDataMap);
  }

  public ServiceException() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceException(ServiceException other) {
    if (other.isSetErrorCode()) {
      this.errorCode = other.errorCode;
    }
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
    if (other.isSetDetails()) {
      this.details = other.details;
    }
    if (other.isSetCallId()) {
      this.callId = other.callId;
    }
    if (other.isSetRequestId()) {
      this.requestId = other.requestId;
    }
  }

  public ServiceException deepCopy() {
    return new ServiceException(this);
  }

  @Override
  public void clear() {
    this.errorCode = null;
    this.errorMessage = null;
    this.details = null;
    this.callId = null;
    this.requestId = null;
  }

  /**
   * 错误码
   * 
   * @see ErrorCode
   */
  public ErrorCode getErrorCode() {
    return this.errorCode;
  }

  /**
   * 错误码
   * 
   * @see ErrorCode
   */
  public ServiceException setErrorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public void unsetErrorCode() {
    this.errorCode = null;
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return this.errorCode != null;
  }

  public void setErrorCodeIsSet(boolean value) {
    if (!value) {
      this.errorCode = null;
    }
  }

  /**
   * 错误信息
   */
  public String getErrorMessage() {
    return this.errorMessage;
  }

  /**
   * 错误信息
   */
  public ServiceException setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  /**
   * 错误信息细节
   */
  public String getDetails() {
    return this.details;
  }

  /**
   * 错误信息细节
   */
  public ServiceException setDetails(String details) {
    this.details = details;
    return this;
  }

  public void unsetDetails() {
    this.details = null;
  }

  /** Returns true if field details is set (has been assigned a value) and false otherwise */
  public boolean isSetDetails() {
    return this.details != null;
  }

  public void setDetailsIsSet(boolean value) {
    if (!value) {
      this.details = null;
    }
  }

  /**
   * RPC调用标识
   */
  public String getCallId() {
    return this.callId;
  }

  /**
   * RPC调用标识
   */
  public ServiceException setCallId(String callId) {
    this.callId = callId;
    return this;
  }

  public void unsetCallId() {
    this.callId = null;
  }

  /** Returns true if field callId is set (has been assigned a value) and false otherwise */
  public boolean isSetCallId() {
    return this.callId != null;
  }

  public void setCallIdIsSet(boolean value) {
    if (!value) {
      this.callId = null;
    }
  }

  /**
   * 请求标识
   */
  public String getRequestId() {
    return this.requestId;
  }

  /**
   * 请求标识
   */
  public ServiceException setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public void unsetRequestId() {
    this.requestId = null;
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return this.requestId != null;
  }

  public void setRequestIdIsSet(boolean value) {
    if (!value) {
      this.requestId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((ErrorCode)value);
      }
      break;

    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((String)value);
      }
      break;

    case DETAILS:
      if (value == null) {
        unsetDetails();
      } else {
        setDetails((String)value);
      }
      break;

    case CALL_ID:
      if (value == null) {
        unsetCallId();
      } else {
        setCallId((String)value);
      }
      break;

    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return getErrorCode();

    case ERROR_MESSAGE:
      return getErrorMessage();

    case DETAILS:
      return getDetails();

    case CALL_ID:
      return getCallId();

    case REQUEST_ID:
      return getRequestId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetErrorCode();
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    case DETAILS:
      return isSetDetails();
    case CALL_ID:
      return isSetCallId();
    case REQUEST_ID:
      return isSetRequestId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServiceException)
      return this.equals((ServiceException)that);
    return false;
  }

  public boolean equals(ServiceException that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (!this.errorCode.equals(that.errorCode))
        return false;
    }

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    boolean this_present_details = true && this.isSetDetails();
    boolean that_present_details = true && that.isSetDetails();
    if (this_present_details || that_present_details) {
      if (!(this_present_details && that_present_details))
        return false;
      if (!this.details.equals(that.details))
        return false;
    }

    boolean this_present_callId = true && this.isSetCallId();
    boolean that_present_callId = true && that.isSetCallId();
    if (this_present_callId || that_present_callId) {
      if (!(this_present_callId && that_present_callId))
        return false;
      if (!this.callId.equals(that.callId))
        return false;
    }

    boolean this_present_requestId = true && this.isSetRequestId();
    boolean that_present_requestId = true && that.isSetRequestId();
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (!this.requestId.equals(that.requestId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errorCode = true && (isSetErrorCode());
    list.add(present_errorCode);
    if (present_errorCode)
      list.add(errorCode.getValue());

    boolean present_errorMessage = true && (isSetErrorMessage());
    list.add(present_errorMessage);
    if (present_errorMessage)
      list.add(errorMessage);

    boolean present_details = true && (isSetDetails());
    list.add(present_details);
    if (present_details)
      list.add(details);

    boolean present_callId = true && (isSetCallId());
    list.add(present_callId);
    if (present_callId)
      list.add(callId);

    boolean present_requestId = true && (isSetRequestId());
    list.add(present_requestId);
    if (present_requestId)
      list.add(requestId);

    return list.hashCode();
  }

  @Override
  public int compareTo(ServiceException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetails()).compareTo(other.isSetDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetails()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.details, other.details);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCallId()).compareTo(other.isSetCallId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCallId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.callId, other.callId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestId()).compareTo(other.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.requestId, other.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServiceException(");
    boolean first = true;

    if (isSetErrorCode()) {
      sb.append("errorCode:");
      if (this.errorCode == null) {
        sb.append("null");
      } else {
        sb.append(this.errorCode);
      }
      first = false;
    }
    if (isSetErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("errorMessage:");
      if (this.errorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMessage);
      }
      first = false;
    }
    if (isSetDetails()) {
      if (!first) sb.append(", ");
      sb.append("details:");
      if (this.details == null) {
        sb.append("null");
      } else {
        sb.append(this.details);
      }
      first = false;
    }
    if (isSetCallId()) {
      if (!first) sb.append(", ");
      sb.append("callId:");
      if (this.callId == null) {
        sb.append("null");
      } else {
        sb.append(this.callId);
      }
      first = false;
    }
    if (isSetRequestId()) {
      if (!first) sb.append(", ");
      sb.append("requestId:");
      if (this.requestId == null) {
        sb.append("null");
      } else {
        sb.append(this.requestId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ServiceExceptionStandardSchemeFactory implements SchemeFactory {
    public ServiceExceptionStandardScheme getScheme() {
      return new ServiceExceptionStandardScheme();
    }
  }

  private static class ServiceExceptionStandardScheme extends StandardScheme<ServiceException> {

    public void read(libthrift091.protocol.TProtocol iprot, ServiceException struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.errorCode = com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.findByValue(iprot.readI32());
              struct.setErrorCodeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_MESSAGE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DETAILS
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.details = iprot.readString();
              struct.setDetailsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CALL_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.callId = iprot.readString();
              struct.setCallIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQUEST_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.requestId = iprot.readString();
              struct.setRequestIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, ServiceException struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errorCode != null) {
        if (struct.isSetErrorCode()) {
          oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
          oprot.writeI32(struct.errorCode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.errorMessage != null) {
        if (struct.isSetErrorMessage()) {
          oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errorMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.details != null) {
        if (struct.isSetDetails()) {
          oprot.writeFieldBegin(DETAILS_FIELD_DESC);
          oprot.writeString(struct.details);
          oprot.writeFieldEnd();
        }
      }
      if (struct.callId != null) {
        if (struct.isSetCallId()) {
          oprot.writeFieldBegin(CALL_ID_FIELD_DESC);
          oprot.writeString(struct.callId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.requestId != null) {
        if (struct.isSetRequestId()) {
          oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
          oprot.writeString(struct.requestId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServiceExceptionTupleSchemeFactory implements SchemeFactory {
    public ServiceExceptionTupleScheme getScheme() {
      return new ServiceExceptionTupleScheme();
    }
  }

  private static class ServiceExceptionTupleScheme extends TupleScheme<ServiceException> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ServiceException struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetErrorCode()) {
        optionals.set(0);
      }
      if (struct.isSetErrorMessage()) {
        optionals.set(1);
      }
      if (struct.isSetDetails()) {
        optionals.set(2);
      }
      if (struct.isSetCallId()) {
        optionals.set(3);
      }
      if (struct.isSetRequestId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode.getValue());
      }
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
      if (struct.isSetDetails()) {
        oprot.writeString(struct.details);
      }
      if (struct.isSetCallId()) {
        oprot.writeString(struct.callId);
      }
      if (struct.isSetRequestId()) {
        oprot.writeString(struct.requestId);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ServiceException struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.errorCode = com.xiaomi.infra.galaxy.sds.thrift.ErrorCode.findByValue(iprot.readI32());
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.details = iprot.readString();
        struct.setDetailsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.callId = iprot.readString();
        struct.setCallIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.requestId = iprot.readString();
        struct.setRequestIdIsSet(true);
      }
    }
  }

}

