package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23283 {
    private final Productionnull_23283 production = new Productionnull_23283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}