package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36928 {
    private final Productionnull_36928 production = new Productionnull_36928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}