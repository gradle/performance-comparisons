package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4476 {
    private final Productionnull_4476 production = new Productionnull_4476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}