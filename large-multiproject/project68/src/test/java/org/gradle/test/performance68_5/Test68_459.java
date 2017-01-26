package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_459 {
    private final Production68_459 production = new Production68_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}