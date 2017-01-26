package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36983 {
    private final Productionnull_36983 production = new Productionnull_36983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}