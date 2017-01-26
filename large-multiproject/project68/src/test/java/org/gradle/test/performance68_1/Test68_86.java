package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_86 {
    private final Production68_86 production = new Production68_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}