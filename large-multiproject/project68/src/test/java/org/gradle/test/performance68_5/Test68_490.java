package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_490 {
    private final Production68_490 production = new Production68_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}