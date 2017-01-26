package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_277 {
    private final Production91_277 production = new Production91_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}