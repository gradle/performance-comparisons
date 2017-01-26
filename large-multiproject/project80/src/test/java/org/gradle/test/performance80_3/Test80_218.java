package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_218 {
    private final Production80_218 production = new Production80_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}