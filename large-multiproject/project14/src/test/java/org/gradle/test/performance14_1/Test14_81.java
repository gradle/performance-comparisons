package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_81 {
    private final Production14_81 production = new Production14_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}