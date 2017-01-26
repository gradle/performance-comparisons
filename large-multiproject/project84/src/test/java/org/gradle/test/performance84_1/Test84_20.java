package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_20 {
    private final Production84_20 production = new Production84_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}