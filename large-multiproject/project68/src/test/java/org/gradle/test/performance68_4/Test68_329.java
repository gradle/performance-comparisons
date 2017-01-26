package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_329 {
    private final Production68_329 production = new Production68_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}