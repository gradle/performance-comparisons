package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_23 {
    private final Production68_23 production = new Production68_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}