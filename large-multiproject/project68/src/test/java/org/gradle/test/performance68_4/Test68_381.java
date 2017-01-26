package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_381 {
    private final Production68_381 production = new Production68_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}