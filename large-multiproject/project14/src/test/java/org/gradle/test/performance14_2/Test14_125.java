package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_125 {
    private final Production14_125 production = new Production14_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}