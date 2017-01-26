package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_271 {
    private final Production68_271 production = new Production68_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}