package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42981 {
    private final Productionnull_42981 production = new Productionnull_42981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}