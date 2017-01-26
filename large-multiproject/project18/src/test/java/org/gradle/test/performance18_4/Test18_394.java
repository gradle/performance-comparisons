package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_394 {
    private final Production18_394 production = new Production18_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}