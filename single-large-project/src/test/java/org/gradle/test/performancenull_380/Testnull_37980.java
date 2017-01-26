package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37980 {
    private final Productionnull_37980 production = new Productionnull_37980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}