package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_393 {
    private final Production55_393 production = new Production55_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}