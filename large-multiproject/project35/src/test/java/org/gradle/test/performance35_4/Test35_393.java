package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_393 {
    private final Production35_393 production = new Production35_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}