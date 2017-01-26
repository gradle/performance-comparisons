package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43373 {
    private final Productionnull_43373 production = new Productionnull_43373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}