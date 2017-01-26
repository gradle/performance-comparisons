package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_383 {
    private final Production42_383 production = new Production42_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}