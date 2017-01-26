package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_277 {
    private final Production60_277 production = new Production60_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}