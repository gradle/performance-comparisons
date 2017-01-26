package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_213 {
    private final Production75_213 production = new Production75_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}