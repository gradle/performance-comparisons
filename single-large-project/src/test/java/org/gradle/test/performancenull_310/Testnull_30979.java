package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30979 {
    private final Productionnull_30979 production = new Productionnull_30979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}