package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_123 {
    private final Production68_123 production = new Production68_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}