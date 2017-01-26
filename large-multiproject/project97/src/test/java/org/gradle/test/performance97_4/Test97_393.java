package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_393 {
    private final Production97_393 production = new Production97_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}