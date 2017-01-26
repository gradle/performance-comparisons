package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30643 {
    private final Productionnull_30643 production = new Productionnull_30643("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}