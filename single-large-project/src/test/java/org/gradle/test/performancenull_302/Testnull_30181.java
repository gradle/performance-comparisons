package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30181 {
    private final Productionnull_30181 production = new Productionnull_30181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}