package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_312 {
    private final Production68_312 production = new Production68_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}