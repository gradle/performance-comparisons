package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_164 {
    private final Production80_164 production = new Production80_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}