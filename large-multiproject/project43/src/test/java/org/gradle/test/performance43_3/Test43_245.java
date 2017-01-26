package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_245 {
    private final Production43_245 production = new Production43_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}