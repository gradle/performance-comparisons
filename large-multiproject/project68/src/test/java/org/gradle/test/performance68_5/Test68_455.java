package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_455 {
    private final Production68_455 production = new Production68_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}