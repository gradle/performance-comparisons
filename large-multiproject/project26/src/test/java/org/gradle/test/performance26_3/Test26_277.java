package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_277 {
    private final Production26_277 production = new Production26_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}