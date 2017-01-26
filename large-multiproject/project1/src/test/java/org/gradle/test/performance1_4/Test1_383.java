package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_383 {
    private final Production1_383 production = new Production1_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}