package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_429 {
    private final Production68_429 production = new Production68_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}