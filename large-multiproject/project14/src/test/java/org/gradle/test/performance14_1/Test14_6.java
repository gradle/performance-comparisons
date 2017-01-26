package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_6 {
    private final Production14_6 production = new Production14_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}