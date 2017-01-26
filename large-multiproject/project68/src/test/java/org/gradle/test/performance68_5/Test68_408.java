package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_408 {
    private final Production68_408 production = new Production68_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}