package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40814 {
    private final Productionnull_40814 production = new Productionnull_40814("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}