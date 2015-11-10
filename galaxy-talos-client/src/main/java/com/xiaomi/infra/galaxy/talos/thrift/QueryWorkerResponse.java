/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-10")
public class QueryWorkerResponse implements libthrift091.TBase<QueryWorkerResponse, QueryWorkerResponse._Fields>, java.io.Serializable, Cloneable, Comparable<QueryWorkerResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryWorkerResponse");

  private static final libthrift091.protocol.TField WORKER_MAP_FIELD_DESC = new libthrift091.protocol.TField("workerMap", libthrift091.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryWorkerResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryWorkerResponseTupleSchemeFactory());
  }

  /**
   * alived worker and corresponding serving partitions id list
   * 
   */
  public Map<String,List<Integer>> workerMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * alived worker and corresponding serving partitions id list
     * 
     */
    WORKER_MAP((short)1, "workerMap");

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
        case 1: // WORKER_MAP
          return WORKER_MAP;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WORKER_MAP, new libthrift091.meta_data.FieldMetaData("workerMap", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
                new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryWorkerResponse.class, metaDataMap);
  }

  public QueryWorkerResponse() {
  }

  public QueryWorkerResponse(
    Map<String,List<Integer>> workerMap)
  {
    this();
    this.workerMap = workerMap;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryWorkerResponse(QueryWorkerResponse other) {
    if (other.isSetWorkerMap()) {
      Map<String,List<Integer>> __this__workerMap = new HashMap<String,List<Integer>>(other.workerMap.size());
      for (Map.Entry<String, List<Integer>> other_element : other.workerMap.entrySet()) {

        String other_element_key = other_element.getKey();
        List<Integer> other_element_value = other_element.getValue();

        String __this__workerMap_copy_key = other_element_key;

        List<Integer> __this__workerMap_copy_value = new ArrayList<Integer>(other_element_value);

        __this__workerMap.put(__this__workerMap_copy_key, __this__workerMap_copy_value);
      }
      this.workerMap = __this__workerMap;
    }
  }

  public QueryWorkerResponse deepCopy() {
    return new QueryWorkerResponse(this);
  }

  @Override
  public void clear() {
    this.workerMap = null;
  }

  public int getWorkerMapSize() {
    return (this.workerMap == null) ? 0 : this.workerMap.size();
  }

  public void putToWorkerMap(String key, List<Integer> val) {
    if (this.workerMap == null) {
      this.workerMap = new HashMap<String,List<Integer>>();
    }
    this.workerMap.put(key, val);
  }

  /**
   * alived worker and corresponding serving partitions id list
   * 
   */
  public Map<String,List<Integer>> getWorkerMap() {
    return this.workerMap;
  }

  /**
   * alived worker and corresponding serving partitions id list
   * 
   */
  public QueryWorkerResponse setWorkerMap(Map<String,List<Integer>> workerMap) {
    this.workerMap = workerMap;
    return this;
  }

  public void unsetWorkerMap() {
    this.workerMap = null;
  }

  /** Returns true if field workerMap is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerMap() {
    return this.workerMap != null;
  }

  public void setWorkerMapIsSet(boolean value) {
    if (!value) {
      this.workerMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WORKER_MAP:
      if (value == null) {
        unsetWorkerMap();
      } else {
        setWorkerMap((Map<String,List<Integer>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WORKER_MAP:
      return getWorkerMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WORKER_MAP:
      return isSetWorkerMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryWorkerResponse)
      return this.equals((QueryWorkerResponse)that);
    return false;
  }

  public boolean equals(QueryWorkerResponse that) {
    if (that == null)
      return false;

    boolean this_present_workerMap = true && this.isSetWorkerMap();
    boolean that_present_workerMap = true && that.isSetWorkerMap();
    if (this_present_workerMap || that_present_workerMap) {
      if (!(this_present_workerMap && that_present_workerMap))
        return false;
      if (!this.workerMap.equals(that.workerMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_workerMap = true && (isSetWorkerMap());
    list.add(present_workerMap);
    if (present_workerMap)
      list.add(workerMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryWorkerResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWorkerMap()).compareTo(other.isSetWorkerMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerMap()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.workerMap, other.workerMap);
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
    StringBuilder sb = new StringBuilder("QueryWorkerResponse(");
    boolean first = true;

    sb.append("workerMap:");
    if (this.workerMap == null) {
      sb.append("null");
    } else {
      sb.append(this.workerMap);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (workerMap == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'workerMap' was not present! Struct: " + toString());
    }
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

  private static class QueryWorkerResponseStandardSchemeFactory implements SchemeFactory {
    public QueryWorkerResponseStandardScheme getScheme() {
      return new QueryWorkerResponseStandardScheme();
    }
  }

  private static class QueryWorkerResponseStandardScheme extends StandardScheme<QueryWorkerResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryWorkerResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WORKER_MAP
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map32 = iprot.readMapBegin();
                struct.workerMap = new HashMap<String,List<Integer>>(2*_map32.size);
                String _key33;
                List<Integer> _val34;
                for (int _i35 = 0; _i35 < _map32.size; ++_i35)
                {
                  _key33 = iprot.readString();
                  {
                    libthrift091.protocol.TList _list36 = iprot.readListBegin();
                    _val34 = new ArrayList<Integer>(_list36.size);
                    int _elem37;
                    for (int _i38 = 0; _i38 < _list36.size; ++_i38)
                    {
                      _elem37 = iprot.readI32();
                      _val34.add(_elem37);
                    }
                    iprot.readListEnd();
                  }
                  struct.workerMap.put(_key33, _val34);
                }
                iprot.readMapEnd();
              }
              struct.setWorkerMapIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, QueryWorkerResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.workerMap != null) {
        oprot.writeFieldBegin(WORKER_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.LIST, struct.workerMap.size()));
          for (Map.Entry<String, List<Integer>> _iter39 : struct.workerMap.entrySet())
          {
            oprot.writeString(_iter39.getKey());
            {
              oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, _iter39.getValue().size()));
              for (int _iter40 : _iter39.getValue())
              {
                oprot.writeI32(_iter40);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryWorkerResponseTupleSchemeFactory implements SchemeFactory {
    public QueryWorkerResponseTupleScheme getScheme() {
      return new QueryWorkerResponseTupleScheme();
    }
  }

  private static class QueryWorkerResponseTupleScheme extends TupleScheme<QueryWorkerResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryWorkerResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.workerMap.size());
        for (Map.Entry<String, List<Integer>> _iter41 : struct.workerMap.entrySet())
        {
          oprot.writeString(_iter41.getKey());
          {
            oprot.writeI32(_iter41.getValue().size());
            for (int _iter42 : _iter41.getValue())
            {
              oprot.writeI32(_iter42);
            }
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryWorkerResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TMap _map43 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.LIST, iprot.readI32());
        struct.workerMap = new HashMap<String,List<Integer>>(2*_map43.size);
        String _key44;
        List<Integer> _val45;
        for (int _i46 = 0; _i46 < _map43.size; ++_i46)
        {
          _key44 = iprot.readString();
          {
            libthrift091.protocol.TList _list47 = new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, iprot.readI32());
            _val45 = new ArrayList<Integer>(_list47.size);
            int _elem48;
            for (int _i49 = 0; _i49 < _list47.size; ++_i49)
            {
              _elem48 = iprot.readI32();
              _val45.add(_elem48);
            }
          }
          struct.workerMap.put(_key44, _val45);
        }
      }
      struct.setWorkerMapIsSet(true);
    }
  }

}

