package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_277 {
    private final Production81_277 production = new Production81_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}