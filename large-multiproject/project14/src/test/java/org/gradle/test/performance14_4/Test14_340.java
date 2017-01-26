package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_340 {
    private final Production14_340 production = new Production14_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}