package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14951 {
    private final Productionnull_14951 production = new Productionnull_14951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}