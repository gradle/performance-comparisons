package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_423 {
    private final Production68_423 production = new Production68_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}