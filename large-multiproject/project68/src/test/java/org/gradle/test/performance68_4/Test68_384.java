package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_384 {
    private final Production68_384 production = new Production68_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}