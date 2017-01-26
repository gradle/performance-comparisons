package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_117 {
    private final Production43_117 production = new Production43_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}