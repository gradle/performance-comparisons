package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24926 {
    private final Productionnull_24926 production = new Productionnull_24926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}