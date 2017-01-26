package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_474 {
    private final Production14_474 production = new Production14_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}