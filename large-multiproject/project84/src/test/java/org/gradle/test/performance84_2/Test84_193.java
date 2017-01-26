package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_193 {
    private final Production84_193 production = new Production84_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}