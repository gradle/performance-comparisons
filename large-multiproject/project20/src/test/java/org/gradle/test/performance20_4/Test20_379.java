package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_379 {
    private final Production20_379 production = new Production20_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}