package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_176 {
    private final Production14_176 production = new Production14_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}