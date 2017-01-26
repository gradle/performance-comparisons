package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_393 {
    private final Production42_393 production = new Production42_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}