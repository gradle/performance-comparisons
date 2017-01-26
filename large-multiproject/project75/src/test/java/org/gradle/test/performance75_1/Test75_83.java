package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_83 {
    private final Production75_83 production = new Production75_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}