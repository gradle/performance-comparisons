package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_436 {
    private final Production20_436 production = new Production20_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}