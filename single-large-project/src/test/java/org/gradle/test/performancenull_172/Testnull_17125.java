package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17125 {
    private final Productionnull_17125 production = new Productionnull_17125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}