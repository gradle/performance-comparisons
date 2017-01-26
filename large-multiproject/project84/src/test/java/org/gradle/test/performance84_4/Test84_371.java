package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_371 {
    private final Production84_371 production = new Production84_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}