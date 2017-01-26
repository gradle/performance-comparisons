package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_129 {
    private final Production49_129 production = new Production49_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}