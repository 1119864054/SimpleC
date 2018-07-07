package pers.shayz.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderIsNull() {
            addCriterion("userId_fk_order is null");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderIsNotNull() {
            addCriterion("userId_fk_order is not null");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderEqualTo(Integer value) {
            addCriterion("userId_fk_order =", value, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderNotEqualTo(Integer value) {
            addCriterion("userId_fk_order <>", value, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderGreaterThan(Integer value) {
            addCriterion("userId_fk_order >", value, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId_fk_order >=", value, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderLessThan(Integer value) {
            addCriterion("userId_fk_order <", value, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderLessThanOrEqualTo(Integer value) {
            addCriterion("userId_fk_order <=", value, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderIn(List<Integer> values) {
            addCriterion("userId_fk_order in", values, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderNotIn(List<Integer> values) {
            addCriterion("userId_fk_order not in", values, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderBetween(Integer value1, Integer value2) {
            addCriterion("userId_fk_order between", value1, value2, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("userId_fk_order not between", value1, value2, "useridFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderIsNull() {
            addCriterion("goodsId_fk_order is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderIsNotNull() {
            addCriterion("goodsId_fk_order is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderEqualTo(Integer value) {
            addCriterion("goodsId_fk_order =", value, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderNotEqualTo(Integer value) {
            addCriterion("goodsId_fk_order <>", value, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderGreaterThan(Integer value) {
            addCriterion("goodsId_fk_order >", value, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId_fk_order >=", value, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderLessThan(Integer value) {
            addCriterion("goodsId_fk_order <", value, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId_fk_order <=", value, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderIn(List<Integer> values) {
            addCriterion("goodsId_fk_order in", values, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderNotIn(List<Integer> values) {
            addCriterion("goodsId_fk_order not in", values, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderBetween(Integer value1, Integer value2) {
            addCriterion("goodsId_fk_order between", value1, value2, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsidFkOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId_fk_order not between", value1, value2, "goodsidFkOrder");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderIsNull() {
            addCriterion("orderitemId_fk_order is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderIsNotNull() {
            addCriterion("orderitemId_fk_order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderEqualTo(Integer value) {
            addCriterion("orderitemId_fk_order =", value, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderNotEqualTo(Integer value) {
            addCriterion("orderitemId_fk_order <>", value, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderGreaterThan(Integer value) {
            addCriterion("orderitemId_fk_order >", value, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderitemId_fk_order >=", value, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderLessThan(Integer value) {
            addCriterion("orderitemId_fk_order <", value, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderLessThanOrEqualTo(Integer value) {
            addCriterion("orderitemId_fk_order <=", value, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderIn(List<Integer> values) {
            addCriterion("orderitemId_fk_order in", values, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderNotIn(List<Integer> values) {
            addCriterion("orderitemId_fk_order not in", values, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderBetween(Integer value1, Integer value2) {
            addCriterion("orderitemId_fk_order between", value1, value2, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andOrderitemidFkOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("orderitemId_fk_order not between", value1, value2, "orderitemidFkOrder");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andIsoutIsNull() {
            addCriterion("isOut is null");
            return (Criteria) this;
        }

        public Criteria andIsoutIsNotNull() {
            addCriterion("isOut is not null");
            return (Criteria) this;
        }

        public Criteria andIsoutEqualTo(Integer value) {
            addCriterion("isOut =", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutNotEqualTo(Integer value) {
            addCriterion("isOut <>", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutGreaterThan(Integer value) {
            addCriterion("isOut >", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("isOut >=", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutLessThan(Integer value) {
            addCriterion("isOut <", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutLessThanOrEqualTo(Integer value) {
            addCriterion("isOut <=", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutIn(List<Integer> values) {
            addCriterion("isOut in", values, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutNotIn(List<Integer> values) {
            addCriterion("isOut not in", values, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutBetween(Integer value1, Integer value2) {
            addCriterion("isOut between", value1, value2, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutNotBetween(Integer value1, Integer value2) {
            addCriterion("isOut not between", value1, value2, "isout");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNull() {
            addCriterion("isReceive is null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNotNull() {
            addCriterion("isReceive is not null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveEqualTo(Integer value) {
            addCriterion("isReceive =", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotEqualTo(Integer value) {
            addCriterion("isReceive <>", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThan(Integer value) {
            addCriterion("isReceive >", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isReceive >=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThan(Integer value) {
            addCriterion("isReceive <", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThanOrEqualTo(Integer value) {
            addCriterion("isReceive <=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIn(List<Integer> values) {
            addCriterion("isReceive in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotIn(List<Integer> values) {
            addCriterion("isReceive not in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveBetween(Integer value1, Integer value2) {
            addCriterion("isReceive between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("isReceive not between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNull() {
            addCriterion("isComment is null");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNotNull() {
            addCriterion("isComment is not null");
            return (Criteria) this;
        }

        public Criteria andIscommentEqualTo(Integer value) {
            addCriterion("isComment =", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotEqualTo(Integer value) {
            addCriterion("isComment <>", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThan(Integer value) {
            addCriterion("isComment >", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("isComment >=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThan(Integer value) {
            addCriterion("isComment <", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThanOrEqualTo(Integer value) {
            addCriterion("isComment <=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentIn(List<Integer> values) {
            addCriterion("isComment in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotIn(List<Integer> values) {
            addCriterion("isComment not in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentBetween(Integer value1, Integer value2) {
            addCriterion("isComment between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotBetween(Integer value1, Integer value2) {
            addCriterion("isComment not between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}