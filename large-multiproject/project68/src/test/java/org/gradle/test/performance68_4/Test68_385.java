package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_385 {
    private final Production68_385 production = new Production68_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}