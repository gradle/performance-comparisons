package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3955 {
    private final Productionnull_3955 production = new Productionnull_3955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}