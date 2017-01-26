package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_224 {
    private final Production68_224 production = new Production68_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}