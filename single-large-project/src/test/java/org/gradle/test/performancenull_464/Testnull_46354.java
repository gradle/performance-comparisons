package org.gradle.test.performancenull_464;

import static org.junit.Assert.*;

public class Testnull_46354 {
    private final Productionnull_46354 production = new Productionnull_46354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}