package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_117 {
    private final Production68_117 production = new Production68_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}