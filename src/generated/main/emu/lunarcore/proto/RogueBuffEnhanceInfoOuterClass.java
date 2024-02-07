// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.ProtoUtil;

public final class RogueBuffEnhanceInfoOuterClass {
  /**
   * Protobuf type {@code RogueBuffEnhanceInfo}
   */
  public static final class RogueBuffEnhanceInfo extends ProtoMessage<RogueBuffEnhanceInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional float HNHFMFCDCOC = 7;</code>
     */
    private float hNHFMFCDCOC;

    /**
     * <code>optional uint32 buff_id = 11;</code>
     */
    private int buffId;

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     */
    private final ItemCostListOuterClass.ItemCostList itemCostList = ItemCostListOuterClass.ItemCostList.newInstance();

    private RogueBuffEnhanceInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueBuffEnhanceInfo}
     */
    public static RogueBuffEnhanceInfo newInstance() {
      return new RogueBuffEnhanceInfo();
    }

    /**
     * <code>optional float HNHFMFCDCOC = 7;</code>
     * @return whether the hNHFMFCDCOC field is set
     */
    public boolean hasHNHFMFCDCOC() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional float HNHFMFCDCOC = 7;</code>
     * @return this
     */
    public RogueBuffEnhanceInfo clearHNHFMFCDCOC() {
      bitField0_ &= ~0x00000001;
      hNHFMFCDCOC = 0F;
      return this;
    }

    /**
     * <code>optional float HNHFMFCDCOC = 7;</code>
     * @return the hNHFMFCDCOC
     */
    public float getHNHFMFCDCOC() {
      return hNHFMFCDCOC;
    }

    /**
     * <code>optional float HNHFMFCDCOC = 7;</code>
     * @param value the hNHFMFCDCOC to set
     * @return this
     */
    public RogueBuffEnhanceInfo setHNHFMFCDCOC(final float value) {
      bitField0_ |= 0x00000001;
      hNHFMFCDCOC = value;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @return whether the buffId field is set
     */
    public boolean hasBuffId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @return this
     */
    public RogueBuffEnhanceInfo clearBuffId() {
      bitField0_ &= ~0x00000002;
      buffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @return the buffId
     */
    public int getBuffId() {
      return buffId;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @param value the buffId to set
     * @return this
     */
    public RogueBuffEnhanceInfo setBuffId(final int value) {
      bitField0_ |= 0x00000002;
      buffId = value;
      return this;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @return whether the itemCostList field is set
     */
    public boolean hasItemCostList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @return this
     */
    public RogueBuffEnhanceInfo clearItemCostList() {
      bitField0_ &= ~0x00000004;
      itemCostList.clear();
      return this;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItemCostList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getItemCostList() {
      return itemCostList;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableItemCostList() {
      bitField0_ |= 0x00000004;
      return itemCostList;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 4;</code>
     * @param value the itemCostList to set
     * @return this
     */
    public RogueBuffEnhanceInfo setItemCostList(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000004;
      itemCostList.copyFrom(value);
      return this;
    }

    @Override
    public RogueBuffEnhanceInfo copyFrom(final RogueBuffEnhanceInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        hNHFMFCDCOC = other.hNHFMFCDCOC;
        buffId = other.buffId;
        itemCostList.copyFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public RogueBuffEnhanceInfo mergeFrom(final RogueBuffEnhanceInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasHNHFMFCDCOC()) {
        setHNHFMFCDCOC(other.hNHFMFCDCOC);
      }
      if (other.hasBuffId()) {
        setBuffId(other.buffId);
      }
      if (other.hasItemCostList()) {
        getMutableItemCostList().mergeFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public RogueBuffEnhanceInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      hNHFMFCDCOC = 0F;
      buffId = 0;
      itemCostList.clear();
      return this;
    }

    @Override
    public RogueBuffEnhanceInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemCostList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueBuffEnhanceInfo)) {
        return false;
      }
      RogueBuffEnhanceInfo other = (RogueBuffEnhanceInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasHNHFMFCDCOC() || ProtoUtil.isEqual(hNHFMFCDCOC, other.hNHFMFCDCOC))
        && (!hasBuffId() || buffId == other.buffId)
        && (!hasItemCostList() || itemCostList.equals(other.itemCostList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 61);
        output.writeFloatNoTag(hNHFMFCDCOC);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(buffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(itemCostList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 5;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(itemCostList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueBuffEnhanceInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 61: {
            // hNHFMFCDCOC
            hNHFMFCDCOC = input.readFloat();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // buffId
            buffId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // itemCostList
            input.readMessage(itemCostList);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeFloat(FieldNames.hNHFMFCDCOC, hNHFMFCDCOC);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.buffId, buffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.itemCostList, itemCostList);
      }
      output.endObject();
    }

    @Override
    public RogueBuffEnhanceInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -838377895: {
            if (input.isAtField(FieldNames.hNHFMFCDCOC)) {
              if (!input.trySkipNullValue()) {
                hNHFMFCDCOC = input.readFloat();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1378119474:
          case 227990663: {
            if (input.isAtField(FieldNames.buffId)) {
              if (!input.trySkipNullValue()) {
                buffId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 203506238:
          case -1124889692: {
            if (input.isAtField(FieldNames.itemCostList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(itemCostList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueBuffEnhanceInfo clone() {
      return new RogueBuffEnhanceInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueBuffEnhanceInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueBuffEnhanceInfo(), data).checkInitialized();
    }

    public static RogueBuffEnhanceInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuffEnhanceInfo(), input).checkInitialized();
    }

    public static RogueBuffEnhanceInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuffEnhanceInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueBuffEnhanceInfo messages
     */
    public static MessageFactory<RogueBuffEnhanceInfo> getFactory() {
      return RogueBuffEnhanceInfoFactory.INSTANCE;
    }

    private enum RogueBuffEnhanceInfoFactory implements MessageFactory<RogueBuffEnhanceInfo> {
      INSTANCE;

      @Override
      public RogueBuffEnhanceInfo create() {
        return RogueBuffEnhanceInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName hNHFMFCDCOC = FieldName.forField("HNHFMFCDCOC");

      static final FieldName buffId = FieldName.forField("buffId", "buff_id");

      static final FieldName itemCostList = FieldName.forField("itemCostList", "item_cost_list");
    }
  }
}