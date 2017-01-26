package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_455 {
    private final Production80_455 production = new Production80_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}