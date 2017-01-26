package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_124 {
    private final Production68_124 production = new Production68_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}