package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_159 {
    private final Production43_159 production = new Production43_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}