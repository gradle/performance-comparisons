package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_344 {
    private final Production68_344 production = new Production68_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}