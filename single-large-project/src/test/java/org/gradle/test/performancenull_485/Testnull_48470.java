package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48470 {
    private final Productionnull_48470 production = new Productionnull_48470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}