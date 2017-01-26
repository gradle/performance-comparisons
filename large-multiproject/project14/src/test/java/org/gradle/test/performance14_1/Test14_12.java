package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_12 {
    private final Production14_12 production = new Production14_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}