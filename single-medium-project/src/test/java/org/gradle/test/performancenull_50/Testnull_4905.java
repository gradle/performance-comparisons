package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4905 {
    private final Productionnull_4905 production = new Productionnull_4905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}