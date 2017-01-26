package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_146 {
    private final Production75_146 production = new Production75_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}