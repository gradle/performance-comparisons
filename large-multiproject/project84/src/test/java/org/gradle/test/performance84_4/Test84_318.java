package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_318 {
    private final Production84_318 production = new Production84_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}