package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_486 {
    private final Production68_486 production = new Production68_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}