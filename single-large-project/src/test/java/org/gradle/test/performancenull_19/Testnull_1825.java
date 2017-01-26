package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1825 {
    private final Productionnull_1825 production = new Productionnull_1825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}