package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5993 {
    private final Productionnull_5993 production = new Productionnull_5993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}