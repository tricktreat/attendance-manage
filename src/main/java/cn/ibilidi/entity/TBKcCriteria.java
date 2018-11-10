package cn.ibilidi.entity;

import java.util.ArrayList;
import java.util.List;

public class TBKcCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBKcCriteria() {
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

        public Criteria andKchIsNull() {
            addCriterion("kch is null");
            return (Criteria) this;
        }

        public Criteria andKchIsNotNull() {
            addCriterion("kch is not null");
            return (Criteria) this;
        }

        public Criteria andKchEqualTo(String value) {
            addCriterion("kch =", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchNotEqualTo(String value) {
            addCriterion("kch <>", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchGreaterThan(String value) {
            addCriterion("kch >", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchGreaterThanOrEqualTo(String value) {
            addCriterion("kch >=", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchLessThan(String value) {
            addCriterion("kch <", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchLessThanOrEqualTo(String value) {
            addCriterion("kch <=", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchLike(String value) {
            addCriterion("kch like", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchNotLike(String value) {
            addCriterion("kch not like", value, "kch");
            return (Criteria) this;
        }

        public Criteria andKchIn(List<String> values) {
            addCriterion("kch in", values, "kch");
            return (Criteria) this;
        }

        public Criteria andKchNotIn(List<String> values) {
            addCriterion("kch not in", values, "kch");
            return (Criteria) this;
        }

        public Criteria andKchBetween(String value1, String value2) {
            addCriterion("kch between", value1, value2, "kch");
            return (Criteria) this;
        }

        public Criteria andKchNotBetween(String value1, String value2) {
            addCriterion("kch not between", value1, value2, "kch");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNull() {
            addCriterion("kcmc is null");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNotNull() {
            addCriterion("kcmc is not null");
            return (Criteria) this;
        }

        public Criteria andKcmcEqualTo(String value) {
            addCriterion("kcmc =", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotEqualTo(String value) {
            addCriterion("kcmc <>", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThan(String value) {
            addCriterion("kcmc >", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThanOrEqualTo(String value) {
            addCriterion("kcmc >=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThan(String value) {
            addCriterion("kcmc <", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThanOrEqualTo(String value) {
            addCriterion("kcmc <=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLike(String value) {
            addCriterion("kcmc like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotLike(String value) {
            addCriterion("kcmc not like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcIn(List<String> values) {
            addCriterion("kcmc in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotIn(List<String> values) {
            addCriterion("kcmc not in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcBetween(String value1, String value2) {
            addCriterion("kcmc between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotBetween(String value1, String value2) {
            addCriterion("kcmc not between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andJshIsNull() {
            addCriterion("jsh is null");
            return (Criteria) this;
        }

        public Criteria andJshIsNotNull() {
            addCriterion("jsh is not null");
            return (Criteria) this;
        }

        public Criteria andJshEqualTo(String value) {
            addCriterion("jsh =", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshNotEqualTo(String value) {
            addCriterion("jsh <>", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshGreaterThan(String value) {
            addCriterion("jsh >", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshGreaterThanOrEqualTo(String value) {
            addCriterion("jsh >=", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshLessThan(String value) {
            addCriterion("jsh <", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshLessThanOrEqualTo(String value) {
            addCriterion("jsh <=", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshLike(String value) {
            addCriterion("jsh like", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshNotLike(String value) {
            addCriterion("jsh not like", value, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshIn(List<String> values) {
            addCriterion("jsh in", values, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshNotIn(List<String> values) {
            addCriterion("jsh not in", values, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshBetween(String value1, String value2) {
            addCriterion("jsh between", value1, value2, "jsh");
            return (Criteria) this;
        }

        public Criteria andJshNotBetween(String value1, String value2) {
            addCriterion("jsh not between", value1, value2, "jsh");
            return (Criteria) this;
        }

        public Criteria andJsxmIsNull() {
            addCriterion("jsxm is null");
            return (Criteria) this;
        }

        public Criteria andJsxmIsNotNull() {
            addCriterion("jsxm is not null");
            return (Criteria) this;
        }

        public Criteria andJsxmEqualTo(String value) {
            addCriterion("jsxm =", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotEqualTo(String value) {
            addCriterion("jsxm <>", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmGreaterThan(String value) {
            addCriterion("jsxm >", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmGreaterThanOrEqualTo(String value) {
            addCriterion("jsxm >=", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmLessThan(String value) {
            addCriterion("jsxm <", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmLessThanOrEqualTo(String value) {
            addCriterion("jsxm <=", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmLike(String value) {
            addCriterion("jsxm like", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotLike(String value) {
            addCriterion("jsxm not like", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmIn(List<String> values) {
            addCriterion("jsxm in", values, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotIn(List<String> values) {
            addCriterion("jsxm not in", values, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmBetween(String value1, String value2) {
            addCriterion("jsxm between", value1, value2, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotBetween(String value1, String value2) {
            addCriterion("jsxm not between", value1, value2, "jsxm");
            return (Criteria) this;
        }

        public Criteria andSksjIsNull() {
            addCriterion("sksj is null");
            return (Criteria) this;
        }

        public Criteria andSksjIsNotNull() {
            addCriterion("sksj is not null");
            return (Criteria) this;
        }

        public Criteria andSksjEqualTo(String value) {
            addCriterion("sksj =", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotEqualTo(String value) {
            addCriterion("sksj <>", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjGreaterThan(String value) {
            addCriterion("sksj >", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjGreaterThanOrEqualTo(String value) {
            addCriterion("sksj >=", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjLessThan(String value) {
            addCriterion("sksj <", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjLessThanOrEqualTo(String value) {
            addCriterion("sksj <=", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjLike(String value) {
            addCriterion("sksj like", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotLike(String value) {
            addCriterion("sksj not like", value, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjIn(List<String> values) {
            addCriterion("sksj in", values, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotIn(List<String> values) {
            addCriterion("sksj not in", values, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjBetween(String value1, String value2) {
            addCriterion("sksj between", value1, value2, "sksj");
            return (Criteria) this;
        }

        public Criteria andSksjNotBetween(String value1, String value2) {
            addCriterion("sksj not between", value1, value2, "sksj");
            return (Criteria) this;
        }

        public Criteria andSkddIsNull() {
            addCriterion("skdd is null");
            return (Criteria) this;
        }

        public Criteria andSkddIsNotNull() {
            addCriterion("skdd is not null");
            return (Criteria) this;
        }

        public Criteria andSkddEqualTo(String value) {
            addCriterion("skdd =", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotEqualTo(String value) {
            addCriterion("skdd <>", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddGreaterThan(String value) {
            addCriterion("skdd >", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddGreaterThanOrEqualTo(String value) {
            addCriterion("skdd >=", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddLessThan(String value) {
            addCriterion("skdd <", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddLessThanOrEqualTo(String value) {
            addCriterion("skdd <=", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddLike(String value) {
            addCriterion("skdd like", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotLike(String value) {
            addCriterion("skdd not like", value, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddIn(List<String> values) {
            addCriterion("skdd in", values, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotIn(List<String> values) {
            addCriterion("skdd not in", values, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddBetween(String value1, String value2) {
            addCriterion("skdd between", value1, value2, "skdd");
            return (Criteria) this;
        }

        public Criteria andSkddNotBetween(String value1, String value2) {
            addCriterion("skdd not between", value1, value2, "skdd");
            return (Criteria) this;
        }

        public Criteria andAllowornotIsNull() {
            addCriterion("allowornot is null");
            return (Criteria) this;
        }

        public Criteria andAllowornotIsNotNull() {
            addCriterion("allowornot is not null");
            return (Criteria) this;
        }

        public Criteria andAllowornotEqualTo(Integer value) {
            addCriterion("allowornot =", value, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotNotEqualTo(Integer value) {
            addCriterion("allowornot <>", value, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotGreaterThan(Integer value) {
            addCriterion("allowornot >", value, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowornot >=", value, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotLessThan(Integer value) {
            addCriterion("allowornot <", value, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotLessThanOrEqualTo(Integer value) {
            addCriterion("allowornot <=", value, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotIn(List<Integer> values) {
            addCriterion("allowornot in", values, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotNotIn(List<Integer> values) {
            addCriterion("allowornot not in", values, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotBetween(Integer value1, Integer value2) {
            addCriterion("allowornot between", value1, value2, "allowornot");
            return (Criteria) this;
        }

        public Criteria andAllowornotNotBetween(Integer value1, Integer value2) {
            addCriterion("allowornot not between", value1, value2, "allowornot");
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