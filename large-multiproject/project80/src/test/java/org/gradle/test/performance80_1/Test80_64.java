package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_64 {
    private final Production80_64 production = new Production80_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}