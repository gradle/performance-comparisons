package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41072 {
    private final Productionnull_41072 production = new Productionnull_41072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}