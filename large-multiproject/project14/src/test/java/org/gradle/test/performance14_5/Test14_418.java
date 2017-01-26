package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_418 {
    private final Production14_418 production = new Production14_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}