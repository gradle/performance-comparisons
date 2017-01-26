package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_322 {
    private final Production68_322 production = new Production68_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}