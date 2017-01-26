package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_136 {
    private final Production7_136 production = new Production7_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}