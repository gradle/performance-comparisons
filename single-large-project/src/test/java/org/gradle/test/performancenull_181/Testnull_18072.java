package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18072 {
    private final Productionnull_18072 production = new Productionnull_18072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}