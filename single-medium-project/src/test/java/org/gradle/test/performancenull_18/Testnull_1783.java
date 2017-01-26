package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1783 {
    private final Productionnull_1783 production = new Productionnull_1783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}