package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_169 {
    private final Production68_169 production = new Production68_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}