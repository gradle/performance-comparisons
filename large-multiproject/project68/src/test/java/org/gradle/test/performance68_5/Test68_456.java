package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_456 {
    private final Production68_456 production = new Production68_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}