package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_394 {
    private final Production39_394 production = new Production39_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}