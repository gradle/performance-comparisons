package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_322 {
    private final Production20_322 production = new Production20_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}