package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_117 {
    private final Production99_117 production = new Production99_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}