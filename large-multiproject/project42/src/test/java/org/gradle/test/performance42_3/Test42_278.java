package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_278 {
    private final Production42_278 production = new Production42_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}