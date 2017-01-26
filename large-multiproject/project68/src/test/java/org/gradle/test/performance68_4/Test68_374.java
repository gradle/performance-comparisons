package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_374 {
    private final Production68_374 production = new Production68_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}