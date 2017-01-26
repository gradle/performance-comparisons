package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2432 {
    private final Productionnull_2432 production = new Productionnull_2432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}