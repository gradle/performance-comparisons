package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_428 {
    private final Production68_428 production = new Production68_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}