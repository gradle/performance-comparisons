package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_136 {
    private final Production20_136 production = new Production20_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}