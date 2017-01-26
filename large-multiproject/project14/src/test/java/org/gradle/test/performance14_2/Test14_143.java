package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_143 {
    private final Production14_143 production = new Production14_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}