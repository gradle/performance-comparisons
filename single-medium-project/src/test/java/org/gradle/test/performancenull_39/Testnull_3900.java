package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3900 {
    private final Productionnull_3900 production = new Productionnull_3900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}