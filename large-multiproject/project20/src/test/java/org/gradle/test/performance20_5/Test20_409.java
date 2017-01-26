package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_409 {
    private final Production20_409 production = new Production20_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}