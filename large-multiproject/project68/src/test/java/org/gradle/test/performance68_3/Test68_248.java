package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_248 {
    private final Production68_248 production = new Production68_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}