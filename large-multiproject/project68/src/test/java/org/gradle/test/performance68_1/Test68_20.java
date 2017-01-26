package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_20 {
    private final Production68_20 production = new Production68_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}