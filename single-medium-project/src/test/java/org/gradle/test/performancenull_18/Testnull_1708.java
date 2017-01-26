package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1708 {
    private final Productionnull_1708 production = new Productionnull_1708("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}