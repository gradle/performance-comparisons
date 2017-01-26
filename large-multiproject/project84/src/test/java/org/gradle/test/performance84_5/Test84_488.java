package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_488 {
    private final Production84_488 production = new Production84_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}