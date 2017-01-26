package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_4 {
    private final Production14_4 production = new Production14_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}