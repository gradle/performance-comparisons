package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_359 {
    private final Production68_359 production = new Production68_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}