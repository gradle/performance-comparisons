package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3061 {
    private final Productionnull_3061 production = new Productionnull_3061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}