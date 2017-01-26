package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23470 {
    private final Productionnull_23470 production = new Productionnull_23470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}