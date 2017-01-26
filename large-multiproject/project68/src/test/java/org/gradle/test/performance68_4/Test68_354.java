package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_354 {
    private final Production68_354 production = new Production68_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}