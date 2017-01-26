package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_311 {
    private final Production68_311 production = new Production68_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}