package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25883 {
    private final Productionnull_25883 production = new Productionnull_25883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}