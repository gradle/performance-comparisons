package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_394 {
    private final Production42_394 production = new Production42_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}