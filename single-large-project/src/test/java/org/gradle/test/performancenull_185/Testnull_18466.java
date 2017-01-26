package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18466 {
    private final Productionnull_18466 production = new Productionnull_18466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}