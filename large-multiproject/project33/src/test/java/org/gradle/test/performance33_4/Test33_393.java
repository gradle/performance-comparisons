package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_393 {
    private final Production33_393 production = new Production33_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}