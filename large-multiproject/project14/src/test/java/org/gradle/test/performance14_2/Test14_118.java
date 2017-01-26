package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_118 {
    private final Production14_118 production = new Production14_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}