package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_352 {
    private final Production68_352 production = new Production68_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}