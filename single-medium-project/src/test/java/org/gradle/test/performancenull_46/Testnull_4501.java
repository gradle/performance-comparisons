package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4501 {
    private final Productionnull_4501 production = new Productionnull_4501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}