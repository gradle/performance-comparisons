package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_277 {
    private final Production68_277 production = new Production68_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}