package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_245 {
    private final Production30_245 production = new Production30_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}