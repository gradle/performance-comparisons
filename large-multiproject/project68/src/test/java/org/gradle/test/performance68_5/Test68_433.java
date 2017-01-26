package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_433 {
    private final Production68_433 production = new Production68_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}