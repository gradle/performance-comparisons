package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_311 {
    private final Production14_311 production = new Production14_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}