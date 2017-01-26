package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48475 {
    private final Productionnull_48475 production = new Productionnull_48475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}