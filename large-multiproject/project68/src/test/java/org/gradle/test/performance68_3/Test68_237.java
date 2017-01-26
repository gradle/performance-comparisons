package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_237 {
    private final Production68_237 production = new Production68_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}