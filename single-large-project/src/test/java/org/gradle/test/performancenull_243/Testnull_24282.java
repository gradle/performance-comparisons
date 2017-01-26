package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24282 {
    private final Productionnull_24282 production = new Productionnull_24282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}