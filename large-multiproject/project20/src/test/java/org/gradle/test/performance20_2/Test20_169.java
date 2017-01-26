package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_169 {
    private final Production20_169 production = new Production20_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}