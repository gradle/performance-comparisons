package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_180 {
    private final Production84_180 production = new Production84_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}