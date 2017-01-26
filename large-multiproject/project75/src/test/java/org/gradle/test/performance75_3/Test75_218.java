package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_218 {
    private final Production75_218 production = new Production75_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}