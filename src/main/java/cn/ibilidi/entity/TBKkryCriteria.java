package cn.ibilidi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBKkryCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBKkryCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
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

        public Criteria andBjIsNull() {
            addCriterion("bj is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("bj is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(String value) {
            addCriterion("bj =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(String value) {
            addCriterion("bj <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(String value) {
            addCriterion("bj >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(String value) {
            addCriterion("bj >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(String value) {
            addCriterion("bj <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(String value) {
            addCriterion("bj <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLike(String value) {
            addCriterion("bj like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotLike(String value) {
            addCriterion("bj not like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<String> values) {
            addCriterion("bj in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<String> values) {
            addCriterion("bj not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(String value1, String value2) {
            addCriterion("bj between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(String value1, String value2) {
            addCriterion("bj not between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andNjIsNull() {
            addCriterion("nj is null");
            return (Criteria) this;
        }

        public Criteria andNjIsNotNull() {
            addCriterion("nj is not null");
            return (Criteria) this;
        }

        public Criteria andNjEqualTo(String value) {
            addCriterion("nj =", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotEqualTo(String value) {
            addCriterion("nj <>", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThan(String value) {
            addCriterion("nj >", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThanOrEqualTo(String value) {
            addCriterion("nj >=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThan(String value) {
            addCriterion("nj <", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThanOrEqualTo(String value) {
            addCriterion("nj <=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLike(String value) {
            addCriterion("nj like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotLike(String value) {
            addCriterion("nj not like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjIn(List<String> values) {
            addCriterion("nj in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotIn(List<String> values) {
            addCriterion("nj not in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjBetween(String value1, String value2) {
            addCriterion("nj between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotBetween(String value1, String value2) {
            addCriterion("nj not between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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