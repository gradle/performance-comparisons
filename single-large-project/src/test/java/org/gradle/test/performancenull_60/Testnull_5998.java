package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5998 {
    private final Productionnull_5998 production = new Productionnull_5998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}