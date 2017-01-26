package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_64 {
    private final Production68_64 production = new Production68_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}