package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_235 {
    private final Production75_235 production = new Production75_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}