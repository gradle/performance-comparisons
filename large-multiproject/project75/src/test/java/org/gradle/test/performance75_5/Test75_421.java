package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_421 {
    private final Production75_421 production = new Production75_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}