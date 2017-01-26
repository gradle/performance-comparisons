package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30632 {
    private final Productionnull_30632 production = new Productionnull_30632("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}