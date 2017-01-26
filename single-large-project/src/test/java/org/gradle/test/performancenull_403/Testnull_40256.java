package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40256 {
    private final Productionnull_40256 production = new Productionnull_40256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}