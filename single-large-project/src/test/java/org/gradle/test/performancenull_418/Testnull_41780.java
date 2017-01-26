package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41780 {
    private final Productionnull_41780 production = new Productionnull_41780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}