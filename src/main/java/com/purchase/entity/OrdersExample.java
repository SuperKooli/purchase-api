package com.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleIsNull() {
            addCriterion("orderpeople is null");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleIsNotNull() {
            addCriterion("orderpeople is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleEqualTo(String value) {
            addCriterion("orderpeople =", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleNotEqualTo(String value) {
            addCriterion("orderpeople <>", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleGreaterThan(String value) {
            addCriterion("orderpeople >", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("orderpeople >=", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleLessThan(String value) {
            addCriterion("orderpeople <", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleLessThanOrEqualTo(String value) {
            addCriterion("orderpeople <=", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleLike(String value) {
            addCriterion("orderpeople like", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleNotLike(String value) {
            addCriterion("orderpeople not like", value, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleIn(List<String> values) {
            addCriterion("orderpeople in", values, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleNotIn(List<String> values) {
            addCriterion("orderpeople not in", values, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleBetween(String value1, String value2) {
            addCriterion("orderpeople between", value1, value2, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrderpeopleNotBetween(String value1, String value2) {
            addCriterion("orderpeople not between", value1, value2, "orderpeople");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("ordertime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ordertime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("ordertime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("ordertime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("ordertime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ordertime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("ordertime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("ordertime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("ordertime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("ordertime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("ordertime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("ordertime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNull() {
            addCriterion("arrivaltime is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNotNull() {
            addCriterion("arrivaltime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeEqualTo(Date value) {
            addCriterion("arrivaltime =", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotEqualTo(Date value) {
            addCriterion("arrivaltime <>", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThan(Date value) {
            addCriterion("arrivaltime >", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrivaltime >=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThan(Date value) {
            addCriterion("arrivaltime <", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThanOrEqualTo(Date value) {
            addCriterion("arrivaltime <=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIn(List<Date> values) {
            addCriterion("arrivaltime in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotIn(List<Date> values) {
            addCriterion("arrivaltime not in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeBetween(Date value1, Date value2) {
            addCriterion("arrivaltime between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotBetween(Date value1, Date value2) {
            addCriterion("arrivaltime not between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andNeedsidsIsNull() {
            addCriterion("needsids is null");
            return (Criteria) this;
        }

        public Criteria andNeedsidsIsNotNull() {
            addCriterion("needsids is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsidsEqualTo(String value) {
            addCriterion("needsids =", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsNotEqualTo(String value) {
            addCriterion("needsids <>", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsGreaterThan(String value) {
            addCriterion("needsids >", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsGreaterThanOrEqualTo(String value) {
            addCriterion("needsids >=", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsLessThan(String value) {
            addCriterion("needsids <", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsLessThanOrEqualTo(String value) {
            addCriterion("needsids <=", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsLike(String value) {
            addCriterion("needsids like", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsNotLike(String value) {
            addCriterion("needsids not like", value, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsIn(List<String> values) {
            addCriterion("needsids in", values, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsNotIn(List<String> values) {
            addCriterion("needsids not in", values, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsBetween(String value1, String value2) {
            addCriterion("needsids between", value1, value2, "needsids");
            return (Criteria) this;
        }

        public Criteria andNeedsidsNotBetween(String value1, String value2) {
            addCriterion("needsids not between", value1, value2, "needsids");
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