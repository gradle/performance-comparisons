package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_408 {
    private final Production42_408 production = new Production42_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}