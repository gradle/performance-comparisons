package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_301 {
    private final Production68_301 production = new Production68_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}