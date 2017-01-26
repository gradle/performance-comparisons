package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_385 {
    private final Production42_385 production = new Production42_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}