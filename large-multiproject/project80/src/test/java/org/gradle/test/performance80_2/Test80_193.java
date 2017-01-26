package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_193 {
    private final Production80_193 production = new Production80_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}