package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_55 {
    private final Production75_55 production = new Production75_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}