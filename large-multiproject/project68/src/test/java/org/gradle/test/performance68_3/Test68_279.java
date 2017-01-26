package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_279 {
    private final Production68_279 production = new Production68_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}