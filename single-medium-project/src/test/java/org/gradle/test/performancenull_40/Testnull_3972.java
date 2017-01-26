package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3972 {
    private final Productionnull_3972 production = new Productionnull_3972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}