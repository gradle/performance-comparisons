package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37229 {
    private final Productionnull_37229 production = new Productionnull_37229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}