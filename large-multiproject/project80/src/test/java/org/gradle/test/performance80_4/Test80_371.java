package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_371 {
    private final Production80_371 production = new Production80_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}