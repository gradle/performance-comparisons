package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32905 {
    private final Productionnull_32905 production = new Productionnull_32905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}