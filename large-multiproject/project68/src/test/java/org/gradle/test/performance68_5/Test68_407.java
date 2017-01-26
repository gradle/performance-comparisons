package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_407 {
    private final Production68_407 production = new Production68_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}