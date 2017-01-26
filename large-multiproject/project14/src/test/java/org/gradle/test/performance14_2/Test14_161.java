package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_161 {
    private final Production14_161 production = new Production14_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}