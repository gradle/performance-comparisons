package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_159 {
    private final Production22_159 production = new Production22_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}