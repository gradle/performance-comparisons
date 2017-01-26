package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_448 {
    private final Production42_448 production = new Production42_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}