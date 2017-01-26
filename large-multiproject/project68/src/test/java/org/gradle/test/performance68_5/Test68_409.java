package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_409 {
    private final Production68_409 production = new Production68_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}