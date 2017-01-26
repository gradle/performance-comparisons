package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_441 {
    private final Production68_441 production = new Production68_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}