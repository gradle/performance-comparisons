package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_464 {
    private final Production14_464 production = new Production14_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}