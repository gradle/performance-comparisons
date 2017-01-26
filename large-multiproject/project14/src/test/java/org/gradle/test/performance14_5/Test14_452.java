package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_452 {
    private final Production14_452 production = new Production14_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}