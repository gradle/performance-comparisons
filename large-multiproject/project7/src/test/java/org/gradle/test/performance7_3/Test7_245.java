package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_245 {
    private final Production7_245 production = new Production7_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}