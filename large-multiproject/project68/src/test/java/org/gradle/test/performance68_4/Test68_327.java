package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_327 {
    private final Production68_327 production = new Production68_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}