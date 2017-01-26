package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_64 {
    private final Production14_64 production = new Production14_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}