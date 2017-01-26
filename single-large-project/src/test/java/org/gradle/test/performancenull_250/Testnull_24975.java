package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24975 {
    private final Productionnull_24975 production = new Productionnull_24975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}