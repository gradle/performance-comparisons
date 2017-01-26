package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_377 {
    private final Production80_377 production = new Production80_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}