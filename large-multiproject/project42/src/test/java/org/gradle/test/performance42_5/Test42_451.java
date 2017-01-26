package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_451 {
    private final Production42_451 production = new Production42_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}