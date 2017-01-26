package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_368 {
    private final Production68_368 production = new Production68_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}