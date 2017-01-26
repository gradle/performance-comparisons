package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30975 {
    private final Productionnull_30975 production = new Productionnull_30975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}