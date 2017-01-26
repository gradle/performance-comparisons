package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_440 {
    private final Production80_440 production = new Production80_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}