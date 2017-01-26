package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_398 {
    private final Production80_398 production = new Production80_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}