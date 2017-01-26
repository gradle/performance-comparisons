package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_393 {
    private final Production39_393 production = new Production39_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}