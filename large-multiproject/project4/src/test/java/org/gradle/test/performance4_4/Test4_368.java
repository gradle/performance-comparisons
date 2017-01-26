package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_368 {
    private final Production4_368 production = new Production4_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}