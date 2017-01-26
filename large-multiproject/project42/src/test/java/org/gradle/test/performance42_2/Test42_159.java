package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_159 {
    private final Production42_159 production = new Production42_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}