package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_50 {
    private final Production68_50 production = new Production68_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}