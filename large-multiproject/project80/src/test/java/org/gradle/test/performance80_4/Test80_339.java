package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_339 {
    private final Production80_339 production = new Production80_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}