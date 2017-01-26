package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49975 {
    private final Productionnull_49975 production = new Productionnull_49975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}