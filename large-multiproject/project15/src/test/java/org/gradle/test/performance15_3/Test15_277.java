package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_277 {
    private final Production15_277 production = new Production15_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}