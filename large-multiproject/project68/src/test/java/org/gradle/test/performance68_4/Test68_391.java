package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_391 {
    private final Production68_391 production = new Production68_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}