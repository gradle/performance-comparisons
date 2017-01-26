package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_393 {
    private final Production74_393 production = new Production74_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}