package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_277 {
    private final Production19_277 production = new Production19_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}