package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_264 {
    private final Production75_264 production = new Production75_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}