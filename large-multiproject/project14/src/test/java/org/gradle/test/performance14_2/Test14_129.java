package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_129 {
    private final Production14_129 production = new Production14_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}