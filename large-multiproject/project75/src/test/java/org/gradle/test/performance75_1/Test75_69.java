package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_69 {
    private final Production75_69 production = new Production75_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}