package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_283 {
    private final Production68_283 production = new Production68_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}