package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_355 {
    private final Production42_355 production = new Production42_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}