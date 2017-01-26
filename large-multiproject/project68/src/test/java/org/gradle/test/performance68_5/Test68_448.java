package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_448 {
    private final Production68_448 production = new Production68_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}