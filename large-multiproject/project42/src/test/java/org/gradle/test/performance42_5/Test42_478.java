package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_478 {
    private final Production42_478 production = new Production42_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}