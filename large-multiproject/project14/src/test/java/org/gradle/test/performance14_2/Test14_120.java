package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_120 {
    private final Production14_120 production = new Production14_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}