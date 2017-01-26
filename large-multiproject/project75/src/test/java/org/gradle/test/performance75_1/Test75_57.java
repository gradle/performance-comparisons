package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_57 {
    private final Production75_57 production = new Production75_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}