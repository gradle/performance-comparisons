package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_198 {
    private final Production68_198 production = new Production68_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}