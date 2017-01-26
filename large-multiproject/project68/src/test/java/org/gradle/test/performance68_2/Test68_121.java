package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_121 {
    private final Production68_121 production = new Production68_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}