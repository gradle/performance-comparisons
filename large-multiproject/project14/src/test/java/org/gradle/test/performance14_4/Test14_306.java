package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_306 {
    private final Production14_306 production = new Production14_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}