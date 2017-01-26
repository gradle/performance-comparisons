package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_335 {
    private final Production68_335 production = new Production68_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}