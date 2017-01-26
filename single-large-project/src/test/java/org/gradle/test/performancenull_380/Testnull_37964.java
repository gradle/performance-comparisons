package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37964 {
    private final Productionnull_37964 production = new Productionnull_37964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}