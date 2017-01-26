package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_245 {
    private final Production26_245 production = new Production26_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}