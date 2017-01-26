package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_366 {
    private final Production42_366 production = new Production42_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}