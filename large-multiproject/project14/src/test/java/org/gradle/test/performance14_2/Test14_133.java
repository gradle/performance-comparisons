package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_133 {
    private final Production14_133 production = new Production14_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}