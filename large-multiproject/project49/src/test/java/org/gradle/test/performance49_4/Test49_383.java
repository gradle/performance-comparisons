package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_383 {
    private final Production49_383 production = new Production49_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}