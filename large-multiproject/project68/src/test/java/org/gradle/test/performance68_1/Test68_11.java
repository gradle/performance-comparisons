package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_11 {
    private final Production68_11 production = new Production68_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}