package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_159 {
    private final Production79_159 production = new Production79_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}