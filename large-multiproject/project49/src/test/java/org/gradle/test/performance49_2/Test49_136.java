package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_136 {
    private final Production49_136 production = new Production49_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}