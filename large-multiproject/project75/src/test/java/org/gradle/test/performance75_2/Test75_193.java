package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_193 {
    private final Production75_193 production = new Production75_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}