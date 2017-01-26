package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_343 {
    private final Production68_343 production = new Production68_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}