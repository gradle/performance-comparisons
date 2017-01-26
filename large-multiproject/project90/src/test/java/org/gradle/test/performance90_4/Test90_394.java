package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_394 {
    private final Production90_394 production = new Production90_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}