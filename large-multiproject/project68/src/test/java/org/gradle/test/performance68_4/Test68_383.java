package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_383 {
    private final Production68_383 production = new Production68_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}