package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_393 {
    private final Production77_393 production = new Production77_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}