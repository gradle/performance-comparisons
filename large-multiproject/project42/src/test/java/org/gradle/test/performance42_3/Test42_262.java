package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_262 {
    private final Production42_262 production = new Production42_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}