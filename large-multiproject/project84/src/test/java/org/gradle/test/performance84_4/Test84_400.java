package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_400 {
    private final Production84_400 production = new Production84_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}