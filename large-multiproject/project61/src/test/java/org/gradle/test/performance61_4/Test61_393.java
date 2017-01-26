package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_393 {
    private final Production61_393 production = new Production61_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}