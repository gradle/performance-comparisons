package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_393 {
    private final Production3_393 production = new Production3_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}