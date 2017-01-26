package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_451 {
    private final Production68_451 production = new Production68_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}