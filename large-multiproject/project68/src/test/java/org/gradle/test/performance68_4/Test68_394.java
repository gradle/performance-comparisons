package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_394 {
    private final Production68_394 production = new Production68_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}