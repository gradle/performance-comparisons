package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_394 {
    private final Production99_394 production = new Production99_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}