package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_245 {
    private final Production68_245 production = new Production68_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}