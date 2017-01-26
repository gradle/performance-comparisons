package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_348 {
    private final Production42_348 production = new Production42_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}