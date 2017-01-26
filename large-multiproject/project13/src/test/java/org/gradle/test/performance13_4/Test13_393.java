package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_393 {
    private final Production13_393 production = new Production13_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}