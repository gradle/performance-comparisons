package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_240 {
    private final Production68_240 production = new Production68_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}