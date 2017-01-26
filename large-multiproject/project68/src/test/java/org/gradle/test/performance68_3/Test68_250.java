package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_250 {
    private final Production68_250 production = new Production68_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}