package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2787 {
    private final Productionnull_2787 production = new Productionnull_2787("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}