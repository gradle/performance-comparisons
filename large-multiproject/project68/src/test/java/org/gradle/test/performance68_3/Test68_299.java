package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_299 {
    private final Production68_299 production = new Production68_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}