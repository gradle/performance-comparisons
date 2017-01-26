package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_117 {
    private final Production42_117 production = new Production42_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}