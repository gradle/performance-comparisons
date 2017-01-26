package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_277 {
    private final Production29_277 production = new Production29_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}