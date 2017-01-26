package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_410 {
    private final Production68_410 production = new Production68_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}