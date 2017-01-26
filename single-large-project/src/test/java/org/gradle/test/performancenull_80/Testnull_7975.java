package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7975 {
    private final Productionnull_7975 production = new Productionnull_7975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}