package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_136 {
    private final Production92_136 production = new Production92_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}