package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_129 {
    private final Production7_129 production = new Production7_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}