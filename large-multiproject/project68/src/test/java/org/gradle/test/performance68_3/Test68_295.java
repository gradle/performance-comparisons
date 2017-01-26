package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_295 {
    private final Production68_295 production = new Production68_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}