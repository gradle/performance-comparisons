package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30641 {
    private final Productionnull_30641 production = new Productionnull_30641("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}