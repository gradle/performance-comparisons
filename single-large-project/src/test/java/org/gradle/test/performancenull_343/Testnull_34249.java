package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34249 {
    private final Productionnull_34249 production = new Productionnull_34249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}