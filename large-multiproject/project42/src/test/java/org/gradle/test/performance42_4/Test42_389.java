package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_389 {
    private final Production42_389 production = new Production42_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}