package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_211 {
    private final Production42_211 production = new Production42_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}