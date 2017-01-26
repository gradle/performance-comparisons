package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_262 {
    private final Production43_262 production = new Production43_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}