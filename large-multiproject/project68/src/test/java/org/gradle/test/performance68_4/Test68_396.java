package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_396 {
    private final Production68_396 production = new Production68_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}