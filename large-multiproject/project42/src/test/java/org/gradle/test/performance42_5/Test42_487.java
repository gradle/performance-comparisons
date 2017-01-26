package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_487 {
    private final Production42_487 production = new Production42_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}