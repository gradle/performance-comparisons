package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5100 {
    private final Productionnull_5100 production = new Productionnull_5100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}