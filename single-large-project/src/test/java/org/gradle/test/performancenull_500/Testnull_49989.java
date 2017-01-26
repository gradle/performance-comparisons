package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49989 {
    private final Productionnull_49989 production = new Productionnull_49989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}