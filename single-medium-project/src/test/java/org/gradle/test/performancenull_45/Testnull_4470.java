package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4470 {
    private final Productionnull_4470 production = new Productionnull_4470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}