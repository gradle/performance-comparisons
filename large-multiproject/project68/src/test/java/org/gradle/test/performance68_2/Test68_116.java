package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_116 {
    private final Production68_116 production = new Production68_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}