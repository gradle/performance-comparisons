package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_237 {
    private final Production75_237 production = new Production75_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}