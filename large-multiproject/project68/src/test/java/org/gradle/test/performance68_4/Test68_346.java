package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_346 {
    private final Production68_346 production = new Production68_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}