package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_149 {
    private final Production14_149 production = new Production14_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}