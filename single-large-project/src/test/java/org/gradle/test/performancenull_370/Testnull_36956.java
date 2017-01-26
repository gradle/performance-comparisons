package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36956 {
    private final Productionnull_36956 production = new Productionnull_36956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}