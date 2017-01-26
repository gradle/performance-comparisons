package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_480 {
    private final Production68_480 production = new Production68_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}