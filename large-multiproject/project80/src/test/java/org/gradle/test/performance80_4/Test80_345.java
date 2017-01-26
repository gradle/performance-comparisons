package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_345 {
    private final Production80_345 production = new Production80_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}