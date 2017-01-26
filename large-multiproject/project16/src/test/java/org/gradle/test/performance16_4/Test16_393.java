package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_393 {
    private final Production16_393 production = new Production16_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}