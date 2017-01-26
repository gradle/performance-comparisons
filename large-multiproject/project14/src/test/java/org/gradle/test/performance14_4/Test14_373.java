package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_373 {
    private final Production14_373 production = new Production14_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}