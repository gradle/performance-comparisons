package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_150 {
    private final Production75_150 production = new Production75_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}