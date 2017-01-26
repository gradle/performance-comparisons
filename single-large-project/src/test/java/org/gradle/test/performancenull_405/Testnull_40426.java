package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40426 {
    private final Productionnull_40426 production = new Productionnull_40426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}