package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30082 {
    private final Productionnull_30082 production = new Productionnull_30082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}