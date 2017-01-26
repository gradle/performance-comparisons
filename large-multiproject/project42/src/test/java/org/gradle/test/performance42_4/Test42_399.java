package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_399 {
    private final Production42_399 production = new Production42_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}