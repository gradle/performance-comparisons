package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_277 {
    private final Production1_277 production = new Production1_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}