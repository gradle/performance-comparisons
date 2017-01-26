package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42281 {
    private final Productionnull_42281 production = new Productionnull_42281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}