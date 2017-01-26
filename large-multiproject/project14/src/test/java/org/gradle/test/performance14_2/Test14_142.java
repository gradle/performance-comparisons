package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_142 {
    private final Production14_142 production = new Production14_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}