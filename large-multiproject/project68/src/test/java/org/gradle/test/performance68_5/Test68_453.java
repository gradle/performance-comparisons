package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_453 {
    private final Production68_453 production = new Production68_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}