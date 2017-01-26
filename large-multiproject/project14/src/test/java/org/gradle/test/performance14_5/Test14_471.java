package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_471 {
    private final Production14_471 production = new Production14_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}