package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_486 {
    private final Production75_486 production = new Production75_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}