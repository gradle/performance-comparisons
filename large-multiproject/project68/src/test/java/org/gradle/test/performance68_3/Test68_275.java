package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_275 {
    private final Production68_275 production = new Production68_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}