package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_194 {
    private final Production68_194 production = new Production68_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}