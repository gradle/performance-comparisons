package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_276 {
    private final Production68_276 production = new Production68_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}