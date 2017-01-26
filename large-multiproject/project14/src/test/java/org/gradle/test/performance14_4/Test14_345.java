package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_345 {
    private final Production14_345 production = new Production14_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}