package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_115 {
    private final Production68_115 production = new Production68_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}