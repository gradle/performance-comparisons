package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_159 {
    private final Production26_159 production = new Production26_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}