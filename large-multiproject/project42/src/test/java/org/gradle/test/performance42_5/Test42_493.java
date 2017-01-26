package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_493 {
    private final Production42_493 production = new Production42_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}