package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25805 {
    private final Productionnull_25805 production = new Productionnull_25805("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}