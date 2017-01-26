package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_355 {
    private final Production68_355 production = new Production68_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}