package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3603 {
    private final Productionnull_3603 production = new Productionnull_3603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}