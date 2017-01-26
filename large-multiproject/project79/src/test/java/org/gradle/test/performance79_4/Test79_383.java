package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_383 {
    private final Production79_383 production = new Production79_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}