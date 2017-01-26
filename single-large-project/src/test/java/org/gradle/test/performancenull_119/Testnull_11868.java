package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11868 {
    private final Productionnull_11868 production = new Productionnull_11868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}