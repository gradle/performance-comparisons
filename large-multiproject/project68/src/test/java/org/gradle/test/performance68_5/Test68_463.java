package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_463 {
    private final Production68_463 production = new Production68_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}