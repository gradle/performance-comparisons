package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_451 {
    private final Production43_451 production = new Production43_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}