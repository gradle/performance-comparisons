package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_393 {
    private final Production89_393 production = new Production89_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}