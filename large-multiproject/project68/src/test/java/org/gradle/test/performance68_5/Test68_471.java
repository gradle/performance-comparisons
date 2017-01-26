package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_471 {
    private final Production68_471 production = new Production68_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}