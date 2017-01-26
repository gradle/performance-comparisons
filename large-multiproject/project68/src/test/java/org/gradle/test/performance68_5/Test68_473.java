package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_473 {
    private final Production68_473 production = new Production68_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}