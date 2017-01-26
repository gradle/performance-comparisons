package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6972 {
    private final Productionnull_6972 production = new Productionnull_6972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}