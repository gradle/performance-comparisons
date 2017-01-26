package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18205 {
    private final Productionnull_18205 production = new Productionnull_18205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}