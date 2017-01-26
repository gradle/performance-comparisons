package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_319 {
    private final Production68_319 production = new Production68_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}