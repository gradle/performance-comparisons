package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_20 {
    private final Production14_20 production = new Production14_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}