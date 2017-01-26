package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_270 {
    private final Production80_270 production = new Production80_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}