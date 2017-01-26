package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_223 {
    private final Production68_223 production = new Production68_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}