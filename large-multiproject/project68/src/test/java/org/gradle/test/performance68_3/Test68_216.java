package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_216 {
    private final Production68_216 production = new Production68_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}