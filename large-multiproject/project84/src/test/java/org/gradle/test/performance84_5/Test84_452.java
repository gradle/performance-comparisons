package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_452 {
    private final Production84_452 production = new Production84_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}