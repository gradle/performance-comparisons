package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_132 {
    private final Production49_132 production = new Production49_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}