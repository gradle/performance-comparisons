package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_393 {
    private final Production83_393 production = new Production83_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}