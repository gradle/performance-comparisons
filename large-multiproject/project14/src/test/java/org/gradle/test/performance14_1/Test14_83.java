package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_83 {
    private final Production14_83 production = new Production14_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}