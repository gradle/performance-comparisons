package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_393 {
    private final Production30_393 production = new Production30_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}