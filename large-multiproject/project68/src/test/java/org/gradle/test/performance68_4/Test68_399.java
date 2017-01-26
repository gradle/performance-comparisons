package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_399 {
    private final Production68_399 production = new Production68_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}