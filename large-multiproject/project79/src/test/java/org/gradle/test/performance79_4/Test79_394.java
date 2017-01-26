package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_394 {
    private final Production79_394 production = new Production79_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}