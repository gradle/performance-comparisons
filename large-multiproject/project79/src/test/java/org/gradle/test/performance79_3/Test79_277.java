package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_277 {
    private final Production79_277 production = new Production79_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}