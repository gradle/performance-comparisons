package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_400 {
    private final Production80_400 production = new Production80_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}