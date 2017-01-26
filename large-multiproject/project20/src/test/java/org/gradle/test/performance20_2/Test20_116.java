package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_116 {
    private final Production20_116 production = new Production20_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}