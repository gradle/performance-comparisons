package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_455 {
    private final Production14_455 production = new Production14_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}