package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_413 {
    private final Production68_413 production = new Production68_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}