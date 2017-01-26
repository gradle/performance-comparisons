package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34476 {
    private final Productionnull_34476 production = new Productionnull_34476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}