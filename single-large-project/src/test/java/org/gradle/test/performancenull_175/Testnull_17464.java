package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17464 {
    private final Productionnull_17464 production = new Productionnull_17464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}