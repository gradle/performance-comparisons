package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_384 {
    private final Production20_384 production = new Production20_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}