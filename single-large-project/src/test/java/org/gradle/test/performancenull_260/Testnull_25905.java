package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25905 {
    private final Productionnull_25905 production = new Productionnull_25905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}