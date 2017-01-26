package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_397 {
    private final Production42_397 production = new Production42_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}