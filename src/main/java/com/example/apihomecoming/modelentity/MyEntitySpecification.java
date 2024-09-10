package com.example.apihomecoming.modelentity;

import org.springframework.data.domain.Sort;

import java.util.*;
import java.util.function.Predicate;

public class MyEntitySpecification {
    public static Sort withFilters(int param1, int param2,
                                   boolean param3, boolean param4,
                                   boolean param5, boolean param6, boolean param7,
                                   boolean param8, boolean param9, boolean param10,
                                   boolean param11) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (param1 != 0) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field1"), param1));
            }
            if (param2 != 0) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field2"), param2));
            }
            if (param3) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param3));
            }
            if (param4) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param4));
            }
            if (param5) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param5));
            }
            if (param6) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param6));
            }
            if (param7) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param7));
            }
            if (param8) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param8));
            }
            if (param9 != false) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param9));
            }
            if (param10 != false) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param10));
            }
            if (param11 != false) {
                predicates.add((Predicate) criteriaBuilder.equal(root.get("field3"), param11));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}