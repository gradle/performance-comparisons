package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_236 {
    private final Production68_236 production = new Production68_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}