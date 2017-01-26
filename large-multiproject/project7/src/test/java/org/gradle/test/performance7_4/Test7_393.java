package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_393 {
    private final Production7_393 production = new Production7_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}