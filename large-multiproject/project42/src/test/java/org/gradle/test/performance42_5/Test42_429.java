package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_429 {
    private final Production42_429 production = new Production42_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}