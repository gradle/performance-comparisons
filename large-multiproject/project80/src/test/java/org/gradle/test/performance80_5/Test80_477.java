package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_477 {
    private final Production80_477 production = new Production80_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}