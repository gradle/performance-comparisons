package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35183 {
    private final Productionnull_35183 production = new Productionnull_35183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}