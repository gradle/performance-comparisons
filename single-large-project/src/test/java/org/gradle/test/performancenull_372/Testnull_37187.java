package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37187 {
    private final Productionnull_37187 production = new Productionnull_37187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}