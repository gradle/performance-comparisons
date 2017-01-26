package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30698 {
    private final Productionnull_30698 production = new Productionnull_30698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}