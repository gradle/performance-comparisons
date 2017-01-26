package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_136 {
    private final Production30_136 production = new Production30_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}