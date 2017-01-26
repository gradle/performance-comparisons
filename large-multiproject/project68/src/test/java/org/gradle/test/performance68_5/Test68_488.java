package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_488 {
    private final Production68_488 production = new Production68_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}