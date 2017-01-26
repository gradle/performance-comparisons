package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40572 {
    private final Productionnull_40572 production = new Productionnull_40572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}