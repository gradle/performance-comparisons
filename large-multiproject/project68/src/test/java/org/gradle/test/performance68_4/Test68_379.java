package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_379 {
    private final Production68_379 production = new Production68_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}