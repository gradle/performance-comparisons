package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3930 {
    private final Productionnull_3930 production = new Productionnull_3930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}