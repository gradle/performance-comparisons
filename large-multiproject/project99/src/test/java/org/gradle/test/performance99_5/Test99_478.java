package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_478 {
    private final Production99_478 production = new Production99_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}