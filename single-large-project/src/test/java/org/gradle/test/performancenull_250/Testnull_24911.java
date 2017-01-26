package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24911 {
    private final Productionnull_24911 production = new Productionnull_24911("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}