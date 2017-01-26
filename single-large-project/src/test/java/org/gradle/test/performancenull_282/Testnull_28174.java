package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28174 {
    private final Productionnull_28174 production = new Productionnull_28174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}