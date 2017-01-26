package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_493 {
    private final Production68_493 production = new Production68_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}