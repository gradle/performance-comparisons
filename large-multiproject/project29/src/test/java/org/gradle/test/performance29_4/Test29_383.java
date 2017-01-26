package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_383 {
    private final Production29_383 production = new Production29_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}