package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5942 {
    private final Productionnull_5942 production = new Productionnull_5942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}