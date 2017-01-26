package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_136 {
    private final Production80_136 production = new Production80_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}