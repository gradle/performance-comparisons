package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_457 {
    private final Production68_457 production = new Production68_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}