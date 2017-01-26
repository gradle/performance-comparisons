package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_337 {
    private final Production80_337 production = new Production80_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}