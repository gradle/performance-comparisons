package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_103 {
    private final Production20_103 production = new Production20_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}