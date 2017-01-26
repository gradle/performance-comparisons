package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_470 {
    private final Production68_470 production = new Production68_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}