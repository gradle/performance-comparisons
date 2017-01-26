package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_389 {
    private final Production68_389 production = new Production68_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}