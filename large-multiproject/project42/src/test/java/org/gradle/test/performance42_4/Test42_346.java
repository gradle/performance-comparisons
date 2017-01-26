package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_346 {
    private final Production42_346 production = new Production42_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}