package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_454 {
    private final Production68_454 production = new Production68_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}