package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_101 {
    private final Production68_101 production = new Production68_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}