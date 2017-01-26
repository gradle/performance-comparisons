package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30684 {
    private final Productionnull_30684 production = new Productionnull_30684("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}