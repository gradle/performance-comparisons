package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_436 {
    private final Production68_436 production = new Production68_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}