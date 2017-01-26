package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_453 {
    private final Production1_453 production = new Production1_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}