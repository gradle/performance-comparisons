package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_485 {
    private final Production68_485 production = new Production68_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}