package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_499 {
    private final Production68_499 production = new Production68_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}