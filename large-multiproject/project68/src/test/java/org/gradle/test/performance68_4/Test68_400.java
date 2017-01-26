package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_400 {
    private final Production68_400 production = new Production68_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}