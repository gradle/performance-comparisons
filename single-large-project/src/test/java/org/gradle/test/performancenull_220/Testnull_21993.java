package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21993 {
    private final Productionnull_21993 production = new Productionnull_21993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}