package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33061 {
    private final Productionnull_33061 production = new Productionnull_33061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}