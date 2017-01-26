package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_451 {
    private final Production7_451 production = new Production7_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}