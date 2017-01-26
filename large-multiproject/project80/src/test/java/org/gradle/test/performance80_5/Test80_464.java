package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_464 {
    private final Production80_464 production = new Production80_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}