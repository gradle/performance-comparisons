package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_256 {
    private final Production68_256 production = new Production68_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}