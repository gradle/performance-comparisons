package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_453 {
    private final Production42_453 production = new Production42_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}