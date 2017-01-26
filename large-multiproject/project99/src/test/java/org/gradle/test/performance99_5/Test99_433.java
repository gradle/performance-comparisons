package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_433 {
    private final Production99_433 production = new Production99_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}