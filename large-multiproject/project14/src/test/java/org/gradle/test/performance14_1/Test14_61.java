package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_61 {
    private final Production14_61 production = new Production14_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}