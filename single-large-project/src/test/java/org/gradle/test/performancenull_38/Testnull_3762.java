package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3762 {
    private final Productionnull_3762 production = new Productionnull_3762("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}