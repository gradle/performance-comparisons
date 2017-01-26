package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8060 {
    private final Productionnull_8060 production = new Productionnull_8060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}