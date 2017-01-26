package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_468 {
    private final Production75_468 production = new Production75_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}