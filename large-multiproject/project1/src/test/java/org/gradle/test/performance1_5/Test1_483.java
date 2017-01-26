package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_483 {
    private final Production1_483 production = new Production1_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}