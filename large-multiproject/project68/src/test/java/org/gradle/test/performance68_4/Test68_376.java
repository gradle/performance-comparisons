package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_376 {
    private final Production68_376 production = new Production68_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}