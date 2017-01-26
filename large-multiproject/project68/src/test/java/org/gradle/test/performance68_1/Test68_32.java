package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_32 {
    private final Production68_32 production = new Production68_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}