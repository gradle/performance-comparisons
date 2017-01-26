package org.gradle.test.performancenull_498;

import static org.junit.Assert.*;

public class Testnull_49790 {
    private final Productionnull_49790 production = new Productionnull_49790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}