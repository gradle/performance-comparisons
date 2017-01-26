package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_136 {
    private final Production14_136 production = new Production14_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}