package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_277 {
    private final Production95_277 production = new Production95_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}