package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_286 {
    private final Production80_286 production = new Production80_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}