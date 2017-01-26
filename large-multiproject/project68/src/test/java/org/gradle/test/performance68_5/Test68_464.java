package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_464 {
    private final Production68_464 production = new Production68_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}