package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_90 {
    private final Production80_90 production = new Production80_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}