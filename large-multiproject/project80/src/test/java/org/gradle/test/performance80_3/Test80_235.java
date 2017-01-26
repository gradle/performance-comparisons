package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_235 {
    private final Production80_235 production = new Production80_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}