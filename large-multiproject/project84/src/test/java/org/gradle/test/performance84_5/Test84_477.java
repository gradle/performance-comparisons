package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_477 {
    private final Production84_477 production = new Production84_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}