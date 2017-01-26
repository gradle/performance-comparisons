package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_349 {
    private final Production68_349 production = new Production68_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}