package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_451 {
    private final Production99_451 production = new Production99_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}