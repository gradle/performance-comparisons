package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_206 {
    private final Production68_206 production = new Production68_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}