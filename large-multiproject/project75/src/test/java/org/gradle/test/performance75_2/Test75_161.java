package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_161 {
    private final Production75_161 production = new Production75_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}