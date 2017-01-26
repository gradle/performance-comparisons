package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_490 {
    private final Production1_490 production = new Production1_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}