package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_487 {
    private final Production68_487 production = new Production68_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}