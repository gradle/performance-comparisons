package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_277 {
    private final Production33_277 production = new Production33_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}