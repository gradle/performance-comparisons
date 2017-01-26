package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_488 {
    private final Production75_488 production = new Production75_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}