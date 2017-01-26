package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21448 {
    private final Productionnull_21448 production = new Productionnull_21448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}