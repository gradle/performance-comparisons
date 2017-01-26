package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_129 {
    private final Production30_129 production = new Production30_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}