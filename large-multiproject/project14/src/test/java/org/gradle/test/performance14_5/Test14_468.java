package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_468 {
    private final Production14_468 production = new Production14_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}