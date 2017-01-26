package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_308 {
    private final Production68_308 production = new Production68_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}