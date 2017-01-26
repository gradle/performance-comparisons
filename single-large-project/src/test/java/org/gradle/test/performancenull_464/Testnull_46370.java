package org.gradle.test.performancenull_464;

import static org.junit.Assert.*;

public class Testnull_46370 {
    private final Productionnull_46370 production = new Productionnull_46370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}