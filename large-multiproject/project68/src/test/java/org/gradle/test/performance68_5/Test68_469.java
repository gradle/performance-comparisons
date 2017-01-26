package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_469 {
    private final Production68_469 production = new Production68_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}