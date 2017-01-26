package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_244 {
    private final Production80_244 production = new Production80_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}