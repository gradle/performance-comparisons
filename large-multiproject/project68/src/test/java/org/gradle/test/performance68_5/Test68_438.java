package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_438 {
    private final Production68_438 production = new Production68_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}