package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_180 {
    private final Production14_180 production = new Production14_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}