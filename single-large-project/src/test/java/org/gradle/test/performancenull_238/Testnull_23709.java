package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23709 {
    private final Productionnull_23709 production = new Productionnull_23709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}