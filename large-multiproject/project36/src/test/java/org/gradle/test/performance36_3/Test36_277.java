package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_277 {
    private final Production36_277 production = new Production36_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}