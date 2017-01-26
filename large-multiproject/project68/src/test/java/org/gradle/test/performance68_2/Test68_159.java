package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_159 {
    private final Production68_159 production = new Production68_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}