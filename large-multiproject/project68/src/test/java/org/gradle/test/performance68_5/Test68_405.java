package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_405 {
    private final Production68_405 production = new Production68_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}