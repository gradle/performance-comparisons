package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_233 {
    private final Production42_233 production = new Production42_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}