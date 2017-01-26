package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_318 {
    private final Production68_318 production = new Production68_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}