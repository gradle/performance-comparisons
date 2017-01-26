package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34689 {
    private final Productionnull_34689 production = new Productionnull_34689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}