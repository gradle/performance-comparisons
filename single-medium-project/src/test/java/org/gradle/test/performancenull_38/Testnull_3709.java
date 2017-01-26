package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3709 {
    private final Productionnull_3709 production = new Productionnull_3709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}