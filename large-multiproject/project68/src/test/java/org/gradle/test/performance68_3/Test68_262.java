package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_262 {
    private final Production68_262 production = new Production68_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}