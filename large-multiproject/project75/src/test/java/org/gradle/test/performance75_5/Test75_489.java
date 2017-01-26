package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_489 {
    private final Production75_489 production = new Production75_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}