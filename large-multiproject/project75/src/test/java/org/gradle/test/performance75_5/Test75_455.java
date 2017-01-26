package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_455 {
    private final Production75_455 production = new Production75_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}