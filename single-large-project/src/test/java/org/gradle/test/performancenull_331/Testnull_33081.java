package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33081 {
    private final Productionnull_33081 production = new Productionnull_33081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}