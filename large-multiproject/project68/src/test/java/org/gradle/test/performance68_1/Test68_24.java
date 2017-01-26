package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_24 {
    private final Production68_24 production = new Production68_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}