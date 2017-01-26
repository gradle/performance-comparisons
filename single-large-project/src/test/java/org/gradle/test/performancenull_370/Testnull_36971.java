package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36971 {
    private final Productionnull_36971 production = new Productionnull_36971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}