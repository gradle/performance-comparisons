package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6061 {
    private final Productionnull_6061 production = new Productionnull_6061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}