package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_211 {
    private final Production68_211 production = new Production68_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}