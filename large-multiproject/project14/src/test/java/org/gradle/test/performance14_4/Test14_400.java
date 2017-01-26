package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_400 {
    private final Production14_400 production = new Production14_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}