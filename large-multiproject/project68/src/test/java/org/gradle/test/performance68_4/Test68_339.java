package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_339 {
    private final Production68_339 production = new Production68_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}