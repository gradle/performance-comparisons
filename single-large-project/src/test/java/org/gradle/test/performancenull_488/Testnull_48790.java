package org.gradle.test.performancenull_488;

import static org.junit.Assert.*;

public class Testnull_48790 {
    private final Productionnull_48790 production = new Productionnull_48790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}