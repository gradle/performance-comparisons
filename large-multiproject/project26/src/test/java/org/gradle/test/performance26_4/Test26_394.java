package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_394 {
    private final Production26_394 production = new Production26_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}