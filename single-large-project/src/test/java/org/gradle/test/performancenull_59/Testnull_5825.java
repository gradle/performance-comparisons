package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5825 {
    private final Productionnull_5825 production = new Productionnull_5825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}