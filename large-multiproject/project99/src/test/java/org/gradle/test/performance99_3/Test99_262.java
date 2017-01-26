package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_262 {
    private final Production99_262 production = new Production99_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}