package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_146 {
    private final Production14_146 production = new Production14_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}