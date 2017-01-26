package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_335 {
    private final Production42_335 production = new Production42_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}