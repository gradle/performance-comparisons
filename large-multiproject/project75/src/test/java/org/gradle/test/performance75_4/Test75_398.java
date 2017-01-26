package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_398 {
    private final Production75_398 production = new Production75_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}