package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_84 {
    private final Production14_84 production = new Production14_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}