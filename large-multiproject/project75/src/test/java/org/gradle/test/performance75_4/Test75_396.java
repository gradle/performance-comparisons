package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_396 {
    private final Production75_396 production = new Production75_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}