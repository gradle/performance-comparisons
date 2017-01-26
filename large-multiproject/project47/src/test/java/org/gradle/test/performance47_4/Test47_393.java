package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_393 {
    private final Production47_393 production = new Production47_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}