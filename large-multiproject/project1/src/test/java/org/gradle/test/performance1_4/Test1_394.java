package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_394 {
    private final Production1_394 production = new Production1_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}