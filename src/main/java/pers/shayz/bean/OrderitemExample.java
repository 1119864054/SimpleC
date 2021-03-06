package pers.shayz.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderitemExample() {
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

        public Criteria andOrderitemidIsNull() {
            addCriterion("orderitemId is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemidIsNotNull() {
            addCriterion("orderitemId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemidEqualTo(Integer value) {
            addCriterion("orderitemId =", value, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidNotEqualTo(Integer value) {
            addCriterion("orderitemId <>", value, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidGreaterThan(Integer value) {
            addCriterion("orderitemId >", value, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderitemId >=", value, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidLessThan(Integer value) {
            addCriterion("orderitemId <", value, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidLessThanOrEqualTo(Integer value) {
            addCriterion("orderitemId <=", value, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidIn(List<Integer> values) {
            addCriterion("orderitemId in", values, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidNotIn(List<Integer> values) {
            addCriterion("orderitemId not in", values, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidBetween(Integer value1, Integer value2) {
            addCriterion("orderitemId between", value1, value2, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andOrderitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderitemId not between", value1, value2, "orderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidIsNull() {
            addCriterion("addressId_fk_orderitemId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidIsNotNull() {
            addCriterion("addressId_fk_orderitemId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidEqualTo(Integer value) {
            addCriterion("addressId_fk_orderitemId =", value, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidNotEqualTo(Integer value) {
            addCriterion("addressId_fk_orderitemId <>", value, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidGreaterThan(Integer value) {
            addCriterion("addressId_fk_orderitemId >", value, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("addressId_fk_orderitemId >=", value, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidLessThan(Integer value) {
            addCriterion("addressId_fk_orderitemId <", value, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidLessThanOrEqualTo(Integer value) {
            addCriterion("addressId_fk_orderitemId <=", value, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidIn(List<Integer> values) {
            addCriterion("addressId_fk_orderitemId in", values, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidNotIn(List<Integer> values) {
            addCriterion("addressId_fk_orderitemId not in", values, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidBetween(Integer value1, Integer value2) {
            addCriterion("addressId_fk_orderitemId between", value1, value2, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andAddressidFkOrderitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("addressId_fk_orderitemId not between", value1, value2, "addressidFkOrderitemid");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Double value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Double value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Double value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Double value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Double> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Double> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Double value1, Double value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemIsNull() {
            addCriterion("userId_fk_orderitem is null");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemIsNotNull() {
            addCriterion("userId_fk_orderitem is not null");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemEqualTo(Integer value) {
            addCriterion("userId_fk_orderitem =", value, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemNotEqualTo(Integer value) {
            addCriterion("userId_fk_orderitem <>", value, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemGreaterThan(Integer value) {
            addCriterion("userId_fk_orderitem >", value, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId_fk_orderitem >=", value, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemLessThan(Integer value) {
            addCriterion("userId_fk_orderitem <", value, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemLessThanOrEqualTo(Integer value) {
            addCriterion("userId_fk_orderitem <=", value, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemIn(List<Integer> values) {
            addCriterion("userId_fk_orderitem in", values, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemNotIn(List<Integer> values) {
            addCriterion("userId_fk_orderitem not in", values, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemBetween(Integer value1, Integer value2) {
            addCriterion("userId_fk_orderitem between", value1, value2, "useridFkOrderitem");
            return (Criteria) this;
        }

        public Criteria andUseridFkOrderitemNotBetween(Integer value1, Integer value2) {
            addCriterion("userId_fk_orderitem not between", value1, value2, "useridFkOrderitem");
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

        public Criteria andSetoffIsNull() {
            addCriterion("setoff is null");
            return (Criteria) this;
        }

        public Criteria andSetoffIsNotNull() {
            addCriterion("setoff is not null");
            return (Criteria) this;
        }

        public Criteria andSetoffEqualTo(Double value) {
            addCriterion("setoff =", value, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffNotEqualTo(Double value) {
            addCriterion("setoff <>", value, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffGreaterThan(Double value) {
            addCriterion("setoff >", value, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffGreaterThanOrEqualTo(Double value) {
            addCriterion("setoff >=", value, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffLessThan(Double value) {
            addCriterion("setoff <", value, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffLessThanOrEqualTo(Double value) {
            addCriterion("setoff <=", value, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffIn(List<Double> values) {
            addCriterion("setoff in", values, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffNotIn(List<Double> values) {
            addCriterion("setoff not in", values, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffBetween(Double value1, Double value2) {
            addCriterion("setoff between", value1, value2, "setoff");
            return (Criteria) this;
        }

        public Criteria andSetoffNotBetween(Double value1, Double value2) {
            addCriterion("setoff not between", value1, value2, "setoff");
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