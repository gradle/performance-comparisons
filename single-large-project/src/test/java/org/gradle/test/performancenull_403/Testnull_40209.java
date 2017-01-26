package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40209 {
    private final Productionnull_40209 production = new Productionnull_40209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}