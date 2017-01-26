package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_127 {
    private final Production14_127 production = new Production14_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}