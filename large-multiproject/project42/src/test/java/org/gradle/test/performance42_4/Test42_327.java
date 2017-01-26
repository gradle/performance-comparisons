package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_327 {
    private final Production42_327 production = new Production42_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}