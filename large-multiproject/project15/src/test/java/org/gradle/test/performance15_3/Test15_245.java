package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_245 {
    private final Production15_245 production = new Production15_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}