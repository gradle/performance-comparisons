package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40810 {
    private final Productionnull_40810 production = new Productionnull_40810("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}