package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32455 {
    private final Productionnull_32455 production = new Productionnull_32455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}