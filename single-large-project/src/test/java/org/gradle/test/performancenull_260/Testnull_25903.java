package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25903 {
    private final Productionnull_25903 production = new Productionnull_25903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}