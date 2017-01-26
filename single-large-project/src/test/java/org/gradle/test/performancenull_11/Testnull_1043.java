package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1043 {
    private final Productionnull_1043 production = new Productionnull_1043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}