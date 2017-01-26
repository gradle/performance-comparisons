package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_182 {
    private final Production14_182 production = new Production14_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}