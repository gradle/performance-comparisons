package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_343 {
    private final Production84_343 production = new Production84_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}