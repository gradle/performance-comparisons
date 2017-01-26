package org.gradle.test.performancenull_483;

import static org.junit.Assert.*;

public class Testnull_48265 {
    private final Productionnull_48265 production = new Productionnull_48265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}