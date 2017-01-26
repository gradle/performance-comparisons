package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_50 {
    private final Production99_50 production = new Production99_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}