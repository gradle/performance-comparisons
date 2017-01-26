package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_273 {
    private final Production68_273 production = new Production68_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}