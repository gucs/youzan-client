package org.oxerr.youzan.dto.item;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.oxerr.youzan.dto.deserializer.EpochSecondStringDeserializer;
import org.oxerr.youzan.dto.deserializer.InstantDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * <a href="http://open.youzan.com/structparam?struct=GoodsDetail">商品数据结构</a>.
 */
public class GoodsDetail implements Serializable {

	private static final long serialVersionUID = 2016061901L;

	/**
	 * 是否为虚拟商品
	 */
	private Boolean isVirtual;

	/**
	 * 商品定时上架（定时开售）的时间。没设置则为空
	 */
	private Instant autoListingTime;

	/**
	 * 适合wap应用的商品详情url
	 */
	private String detailUrl;

	/**
	 * 运费（针对“统一运费”），格式：5.00；单位：元；精确到：分。
	 */
	private BigDecimal postFee;

	/**
	 * Sku列表
	 */
	private GoodsSku[] skus;

	/**
	 * 商品二维码列表。
	 * 注：仅 kdt.item.get 和 kdt.items.custom.get 接口会返回该字段。
	 */
	private GoodsQrcode[] itemQrcodes;

	/**
	 * 可购买该商品的会员等级id列表
	 */
	private String[] umpLevel;

	/**
	 * 商品推广栏目id，可参考API：kdt.itemcategories.promotions.get
	 */
	private Long promotionCid;

	/**
	 * 每人限购多少件。0代表无限购，默认为0。
	 */
	private Long buyQuota;

	/**
	 * 商品类型。
	 * <ul>
	 * <li>0：普通商品</li>
	 * <li>10：分销商品</li>
	 * </ul>
	 */
	private Integer itemType;

	/**
	 * 商品数量
	 */
	private Long num;

	/**
	 * 运费（针对“运费模版”），格式：5.00；单位：元；精确到：分。
	 * 若存在运费区间，中间用逗号隔开，如 “5.00,9.00”。
	 */
	private String deliveryTemplateFee;

	/**
	 * 模板名称
	 */
	private String templateTitle;

	/**
	 * 商品数字编号
	 */
	private Long numIid;

	/**
	 * 商品标题
	 */
	private String title;

	/**
	 * 商品货号（商家为商品设置的外部编号，可与商家外部系统对接）
	 */
	private String outerId;

	/**
	 * 是否参加会员折扣
	 */
	private Boolean joinLevelDiscount;

	/**
	 * 是否设置商品购买权限
	 */
	private Integer purchaseRight;

	/**
	 * 可购买该商品的用户标签名称列表
	 */
	private String[] umpTagsText;

	/**
	 * 商品价格，格式：5.00；单位：元；精确到：分。
	 */
	private BigDecimal price;

	/**
	 * 商品别称
	 */
	private String alias;

	/**
	 * 运费类型。
	 * <ul>
	 * <li>1：统一邮费；</li>
	 * <li>2：运费模版;</li>
	 * </ul>
	 */
	private Integer postType;

	/**
	 * 可购买该商品的会员等级名称列表
	 */
	private String[] umpLevelText;

	/**
	 * 运费模版名称
	 */
	private String deliveryTemplateName;

	/**
	 * 商品序号
	 */
	private Long order;

	/**
	 * 可购买该商品的用户标签id列表
	 */
	private String[] umpTags;

	/**
	 * 商品标签id串，结构如：1234,1342,...，可参考API：kdt.itemcategories.tags.get
	 */
	private String tagIds;

	/**
	 * 是否是供货商商品。
	 */
	private Boolean isSupplierItem;

	/**
	 * 商品点赞数
	 */
	private Long likeCount;

	/**
	 * 商品标签数据结构
	 */
	private GoodsTag[] itemTags;

	/**
	 * 商品的发布时间
	 */
	private Instant created;

	/**
	 * 商品图片列表
	 */
	private GoodsImage[] itemImgs;

	/**
	 * 商品上架状态。true 为已上架，false 为已下架
	 */
	private Boolean isListing;

	/**
	 * 是否为二手商品
	 */
	private Boolean isUsed;

	/**
	 * 商品销量
	 */
	private Long soldNum;

	/**
	 * 商品外部购买链接
	 */
	private String outerBuyUrl;

	/**
	 * 是否为二手商品
	 */
	private String productType;

	/**
	 * 分享出去的商品详情url
	 */
	private String shareUrl;

	/**
	 * 商品主图片缩略图地址
	 */
	private String picThumbUrl;

	/**
	 * 运费模版id
	 */
	private Long deliveryTemplateId;

	/**
	 * 商品是否锁定。true 为已锁定，false 为未锁定
	 */
	private Boolean isLock;

	/**
	 * 商品留言
	 */
	private Map<String, String>[] messages;

	/**
	 * 模板id
	 */
	private Long templateId;

	/**
	 * 显示在“原价”一栏中的信息
	 */
	private String originPrice;

	/**
	 * 商品主图片地址
	 */
	private String picUrl;

	/**
	 * 商品分类的叶子类目id，可参考API：kdt.itemcategories.get
	 */
	private Long cid;

	/**
	 * 商品描述
	 */
	private String desc;

	public GoodsDetail() {
	}

	public GoodsDetail(
		@JsonProperty("is_virtual") Boolean isVirtual,
		@JsonProperty("auto_listing_time")
		@JsonDeserialize(using = EpochSecondStringDeserializer.class)
		Instant autoListingTime,
		@JsonProperty("detail_url") String detailUrl,
		@JsonProperty("post_fee") BigDecimal postFee,
		@JsonProperty("skus") GoodsSku[] skus,
		@JsonProperty("item_qrcodes") GoodsQrcode[] itemQrcodes,
		@JsonProperty("ump_level") String[] umpLevel,
		@JsonProperty("promotion_cid") Long promotionCid,
		@JsonProperty("buy_quota") Long buyQuota,
		@JsonProperty("item_type") Integer itemType,
		@JsonProperty("num") Long num,
		@JsonProperty("delivery_template_fee") String deliveryTemplateFee,
		@JsonProperty("template_title") String templateTitle,
		@JsonProperty("num_iid") Long numIid,
		@JsonProperty("title") String title,
		@JsonProperty("outer_id") String outerId,
		@JsonProperty("join_level_discount") String joinLevelDiscount,
		@JsonProperty("purchase_right") Integer purchaseRight,
		@JsonProperty("ump_tags_text") String[] umpTagsText,
		@JsonProperty("price") BigDecimal price,
		@JsonProperty("alias") String alias,
		@JsonProperty("post_type") Integer postType,
		@JsonProperty("ump_level_text") String[] umpLevelText,
		@JsonProperty("delivery_template_name") String deliveryTemplateName,
		@JsonProperty("order") Long order,
		@JsonProperty("ump_tags") String[] umpTags,
		@JsonProperty("tag_ids") String tagIds,
		@JsonProperty("is_supplier_item") Boolean isSupplierItem,
		@JsonProperty("like_count") Long likeCount,
		@JsonProperty("item_tags") GoodsTag[] itemTags,
		@JsonProperty("created")
		@JsonDeserialize(using = InstantDeserializer.class)
		Instant created,
		@JsonProperty("item_imgs") GoodsImage[] itemImgs,
		@JsonProperty("is_listing") Boolean isListing,
		@JsonProperty("is_used") Boolean isUsed,
		@JsonProperty("sold_num") Long soldNum,
		@JsonProperty("outer_buy_url") String outerBuyUrl,
		@JsonProperty("product_type") String productType,
		@JsonProperty("share_ur") String shareUrl,
		@JsonProperty("pic_thumb_url") String picThumbUrl,
		@JsonProperty("delivery_template_id") Long deliveryTemplateId,
		@JsonProperty("is_lock") Boolean isLock,
		@JsonProperty("messages") Map<String, String>[] messages,
		@JsonProperty("template_id") Long templateId,
		@JsonProperty("origin_price") String originPrice,
		@JsonProperty("pic_url") String picUrl,
		@JsonProperty("cid") Long cid,
		@JsonProperty("desc") String desc
	) {
		this.isVirtual = isVirtual;
		this.autoListingTime = autoListingTime;
		this.detailUrl = detailUrl;
		this.postFee = postFee;
		this.skus = skus;
		this.itemQrcodes = itemQrcodes;
		this.umpLevel = umpLevel;
		this.promotionCid = promotionCid;
		this.buyQuota = buyQuota;
		this.itemType = itemType;
		this.num = num;
		this.deliveryTemplateFee = deliveryTemplateFee;
		this.templateTitle = templateTitle;
		this.numIid = numIid;
		this.title = title;
		this.outerId = outerId;
		this.joinLevelDiscount = "1".equals(joinLevelDiscount);
		this.purchaseRight = purchaseRight;
		this.umpTagsText = umpTagsText;
		this.price = price;
		this.alias = alias;
		this.postType = postType;
		this.umpLevelText = umpLevelText;
		this.deliveryTemplateName = deliveryTemplateName;
		this.order = order;
		this.umpTags = umpTags;
		this.tagIds = tagIds;
		this.isSupplierItem = isSupplierItem;
		this.likeCount = likeCount;
		this.itemTags = itemTags;
		this.created = created;
		this.itemImgs = itemImgs;
		this.isListing = isListing;
		this.isUsed = isUsed;
		this.soldNum = soldNum;
		this.outerBuyUrl = outerBuyUrl;
		this.productType = productType;
		this.shareUrl = shareUrl;
		this.picThumbUrl = picThumbUrl;
		this.deliveryTemplateId = deliveryTemplateId;
		this.isLock = isLock;
		this.messages = messages;
		this.templateId = templateId;
		this.originPrice = originPrice;
		this.picUrl = picUrl;
		this.cid = cid;
		this.desc = desc;
	}

	public Boolean getIsVirtual() {
		return isVirtual;
	}

	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	public Instant getAutoListingTime() {
		return autoListingTime;
	}

	public void setAutoListingTime(Instant autoListingTime) {
		this.autoListingTime = autoListingTime;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public BigDecimal getPostFee() {
		return postFee;
	}

	public void setPostFee(BigDecimal postFee) {
		this.postFee = postFee;
	}

	public GoodsSku[] getSkus() {
		return skus;
	}

	public void setSkus(GoodsSku[] skus) {
		this.skus = skus;
	}

	public GoodsQrcode[] getItemQrcodes() {
		return itemQrcodes;
	}

	public void setItemQrcodes(GoodsQrcode[] itemQrcodes) {
		this.itemQrcodes = itemQrcodes;
	}

	public String[] getUmpLevel() {
		return umpLevel;
	}

	public void setUmpLevel(String[] umpLevel) {
		this.umpLevel = umpLevel;
	}

	public Long getPromotionCid() {
		return promotionCid;
	}

	public void setPromotionCid(Long promotionCid) {
		this.promotionCid = promotionCid;
	}

	public Long getBuyQuota() {
		return buyQuota;
	}

	public void setBuyQuota(Long buyQuota) {
		this.buyQuota = buyQuota;
	}

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getDeliveryTemplateFee() {
		return deliveryTemplateFee;
	}

	public void setDeliveryTemplateFee(String deliveryTemplateFee) {
		this.deliveryTemplateFee = deliveryTemplateFee;
	}

	public String getTemplateTitle() {
		return templateTitle;
	}

	public void setTemplateTitle(String templateTitle) {
		this.templateTitle = templateTitle;
	}

	public Long getNumIid() {
		return numIid;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = StringEscapeUtils.unescapeHtml4(title);
	}

	public String getOuterId() {
		return outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public Boolean getJoinLevelDiscount() {
		return joinLevelDiscount;
	}

	public void setJoinLevelDiscount(Boolean joinLevelDiscount) {
		this.joinLevelDiscount = joinLevelDiscount;
	}

	public Integer getPurchaseRight() {
		return purchaseRight;
	}

	public void setPurchaseRight(Integer purchaseRight) {
		this.purchaseRight = purchaseRight;
	}

	public String[] getUmpTagsText() {
		return umpTagsText;
	}

	public void setUmpTagsText(String[] umpTagsText) {
		this.umpTagsText = umpTagsText;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getPostType() {
		return postType;
	}

	public void setPostType(Integer postType) {
		this.postType = postType;
	}

	public String[] getUmpLevelText() {
		return umpLevelText;
	}

	public void setUmpLevelText(String[] umpLevelText) {
		this.umpLevelText = umpLevelText;
	}

	public String getDeliveryTemplateName() {
		return deliveryTemplateName;
	}

	public void setDeliveryTemplateName(String deliveryTemplateName) {
		this.deliveryTemplateName = deliveryTemplateName;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public String[] getUmpTags() {
		return umpTags;
	}

	public void setUmpTags(String[] umpTags) {
		this.umpTags = umpTags;
	}

	public String getTagIds() {
		return tagIds;
	}

	public void setTagIds(String tagIds) {
		this.tagIds = tagIds;
	}

	public Boolean getIsSupplierItem() {
		return isSupplierItem;
	}

	public void setIsSupplierItem(Boolean isSupplierItem) {
		this.isSupplierItem = isSupplierItem;
	}

	public Long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Long likeCount) {
		this.likeCount = likeCount;
	}

	public GoodsTag[] getItemTags() {
		return itemTags;
	}

	public void setItemTags(GoodsTag[] itemTags) {
		this.itemTags = itemTags;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public GoodsImage[] getItemImgs() {
		return itemImgs;
	}

	public void setItemImgs(GoodsImage[] itemImgs) {
		this.itemImgs = itemImgs;
	}

	public Boolean getIsListing() {
		return isListing;
	}

	public void setIsListing(Boolean isListing) {
		this.isListing = isListing;
	}

	public Boolean getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}

	public Long getSoldNum() {
		return soldNum;
	}

	public void setSoldNum(Long soldNum) {
		this.soldNum = soldNum;
	}

	public String getOuterBuyUrl() {
		return outerBuyUrl;
	}

	public void setOuterBuyUrl(String outerBuyUrl) {
		this.outerBuyUrl = outerBuyUrl;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public String getPicThumbUrl() {
		return picThumbUrl;
	}

	public void setPicThumbUrl(String picThumbUrl) {
		this.picThumbUrl = picThumbUrl;
	}

	public Long getDeliveryTemplateId() {
		return deliveryTemplateId;
	}

	public void setDeliveryTemplateId(Long deliveryTemplateId) {
		this.deliveryTemplateId = deliveryTemplateId;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Map<String, String>[] getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String>[] messages) {
		this.messages = messages;
	}

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getOriginPrice() {
		return originPrice;
	}

	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
