package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_264 {
    private final Production14_264 production = new Production14_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}