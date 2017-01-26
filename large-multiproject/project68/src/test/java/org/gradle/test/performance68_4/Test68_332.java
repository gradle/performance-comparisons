package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_332 {
    private final Production68_332 production = new Production68_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}