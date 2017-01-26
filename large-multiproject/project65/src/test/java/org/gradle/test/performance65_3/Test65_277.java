package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_277 {
    private final Production65_277 production = new Production65_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}