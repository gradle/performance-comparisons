package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_159 {
    private final Production77_159 production = new Production77_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}