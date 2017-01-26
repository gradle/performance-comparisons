package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_374 {
    private final Production42_374 production = new Production42_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}