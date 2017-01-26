package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_393 {
    private final Production24_393 production = new Production24_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}