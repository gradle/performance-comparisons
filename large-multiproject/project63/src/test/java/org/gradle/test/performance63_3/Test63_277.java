package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_277 {
    private final Production63_277 production = new Production63_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}