package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_123 {
    private final Production29_123 production = new Production29_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}