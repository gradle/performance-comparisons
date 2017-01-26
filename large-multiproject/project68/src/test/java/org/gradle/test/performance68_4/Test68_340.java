package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_340 {
    private final Production68_340 production = new Production68_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}