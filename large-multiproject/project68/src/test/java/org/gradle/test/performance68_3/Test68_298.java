package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_298 {
    private final Production68_298 production = new Production68_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}