/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-26")
public class TotalBill implements libthrift091.TBase<TotalBill, TotalBill._Fields>, java.io.Serializable, Cloneable, Comparable<TotalBill> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TotalBill");

  private static final libthrift091.protocol.TField TOTAL_COST_FIELD_DESC = new libthrift091.protocol.TField("totalCost", libthrift091.protocol.TType.DOUBLE, (short)1);
  private static final libthrift091.protocol.TField BILL_LIST_FIELD_DESC = new libthrift091.protocol.TField("billList", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TotalBillStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TotalBillTupleSchemeFactory());
  }

  public double totalCost; // required
  public List<BillItem> billList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    TOTAL_COST((short)1, "totalCost"),
    BILL_LIST((short)2, "billList");

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
        case 1: // TOTAL_COST
          return TOTAL_COST;
        case 2: // BILL_LIST
          return BILL_LIST;
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
  private static final int __TOTALCOST_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_COST, new libthrift091.meta_data.FieldMetaData("totalCost", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.BILL_LIST, new libthrift091.meta_data.FieldMetaData("billList", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, BillItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TotalBill.class, metaDataMap);
  }

  public TotalBill() {
  }

  public TotalBill(
    double totalCost,
    List<BillItem> billList)
  {
    this();
    this.totalCost = totalCost;
    setTotalCostIsSet(true);
    this.billList = billList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TotalBill(TotalBill other) {
    __isset_bitfield = other.__isset_bitfield;
    this.totalCost = other.totalCost;
    if (other.isSetBillList()) {
      List<BillItem> __this__billList = new ArrayList<BillItem>(other.billList.size());
      for (BillItem other_element : other.billList) {
        __this__billList.add(new BillItem(other_element));
      }
      this.billList = __this__billList;
    }
  }

  public TotalBill deepCopy() {
    return new TotalBill(this);
  }

  @Override
  public void clear() {
    setTotalCostIsSet(false);
    this.totalCost = 0.0;
    this.billList = null;
  }

  public double getTotalCost() {
    return this.totalCost;
  }

  public TotalBill setTotalCost(double totalCost) {
    this.totalCost = totalCost;
    setTotalCostIsSet(true);
    return this;
  }

  public void unsetTotalCost() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALCOST_ISSET_ID);
  }

  /** Returns true if field totalCost is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalCost() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALCOST_ISSET_ID);
  }

  public void setTotalCostIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALCOST_ISSET_ID, value);
  }

  public int getBillListSize() {
    return (this.billList == null) ? 0 : this.billList.size();
  }

  public java.util.Iterator<BillItem> getBillListIterator() {
    return (this.billList == null) ? null : this.billList.iterator();
  }

  public void addToBillList(BillItem elem) {
    if (this.billList == null) {
      this.billList = new ArrayList<BillItem>();
    }
    this.billList.add(elem);
  }

  public List<BillItem> getBillList() {
    return this.billList;
  }

  public TotalBill setBillList(List<BillItem> billList) {
    this.billList = billList;
    return this;
  }

  public void unsetBillList() {
    this.billList = null;
  }

  /** Returns true if field billList is set (has been assigned a value) and false otherwise */
  public boolean isSetBillList() {
    return this.billList != null;
  }

  public void setBillListIsSet(boolean value) {
    if (!value) {
      this.billList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOTAL_COST:
      if (value == null) {
        unsetTotalCost();
      } else {
        setTotalCost((Double)value);
      }
      break;

    case BILL_LIST:
      if (value == null) {
        unsetBillList();
      } else {
        setBillList((List<BillItem>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_COST:
      return Double.valueOf(getTotalCost());

    case BILL_LIST:
      return getBillList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_COST:
      return isSetTotalCost();
    case BILL_LIST:
      return isSetBillList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TotalBill)
      return this.equals((TotalBill)that);
    return false;
  }

  public boolean equals(TotalBill that) {
    if (that == null)
      return false;

    boolean this_present_totalCost = true;
    boolean that_present_totalCost = true;
    if (this_present_totalCost || that_present_totalCost) {
      if (!(this_present_totalCost && that_present_totalCost))
        return false;
      if (this.totalCost != that.totalCost)
        return false;
    }

    boolean this_present_billList = true && this.isSetBillList();
    boolean that_present_billList = true && that.isSetBillList();
    if (this_present_billList || that_present_billList) {
      if (!(this_present_billList && that_present_billList))
        return false;
      if (!this.billList.equals(that.billList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_totalCost = true;
    list.add(present_totalCost);
    if (present_totalCost)
      list.add(totalCost);

    boolean present_billList = true && (isSetBillList());
    list.add(present_billList);
    if (present_billList)
      list.add(billList);

    return list.hashCode();
  }

  @Override
  public int compareTo(TotalBill other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTotalCost()).compareTo(other.isSetTotalCost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalCost()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.totalCost, other.totalCost);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBillList()).compareTo(other.isSetBillList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBillList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.billList, other.billList);
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
    StringBuilder sb = new StringBuilder("TotalBill(");
    boolean first = true;

    sb.append("totalCost:");
    sb.append(this.totalCost);
    first = false;
    if (!first) sb.append(", ");
    sb.append("billList:");
    if (this.billList == null) {
      sb.append("null");
    } else {
      sb.append(this.billList);
    }
    first = false;
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TotalBillStandardSchemeFactory implements SchemeFactory {
    public TotalBillStandardScheme getScheme() {
      return new TotalBillStandardScheme();
    }
  }

  private static class TotalBillStandardScheme extends StandardScheme<TotalBill> {

    public void read(libthrift091.protocol.TProtocol iprot, TotalBill struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_COST
            if (schemeField.type == libthrift091.protocol.TType.DOUBLE) {
              struct.totalCost = iprot.readDouble();
              struct.setTotalCostIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BILL_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.billList = new ArrayList<BillItem>(_list0.size);
                BillItem _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new BillItem();
                  _elem1.read(iprot);
                  struct.billList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setBillListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TotalBill struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOTAL_COST_FIELD_DESC);
      oprot.writeDouble(struct.totalCost);
      oprot.writeFieldEnd();
      if (struct.billList != null) {
        oprot.writeFieldBegin(BILL_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.billList.size()));
          for (BillItem _iter3 : struct.billList)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TotalBillTupleSchemeFactory implements SchemeFactory {
    public TotalBillTupleScheme getScheme() {
      return new TotalBillTupleScheme();
    }
  }

  private static class TotalBillTupleScheme extends TupleScheme<TotalBill> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TotalBill struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTotalCost()) {
        optionals.set(0);
      }
      if (struct.isSetBillList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTotalCost()) {
        oprot.writeDouble(struct.totalCost);
      }
      if (struct.isSetBillList()) {
        {
          oprot.writeI32(struct.billList.size());
          for (BillItem _iter4 : struct.billList)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TotalBill struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.totalCost = iprot.readDouble();
        struct.setTotalCostIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.billList = new ArrayList<BillItem>(_list5.size);
          BillItem _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new BillItem();
            _elem6.read(iprot);
            struct.billList.add(_elem6);
          }
        }
        struct.setBillListIsSet(true);
      }
    }
  }

}
