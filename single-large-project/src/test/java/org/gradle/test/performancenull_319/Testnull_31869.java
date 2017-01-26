package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31869 {
    private final Productionnull_31869 production = new Productionnull_31869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}