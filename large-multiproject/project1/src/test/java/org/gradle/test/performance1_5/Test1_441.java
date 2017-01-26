package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_441 {
    private final Production1_441 production = new Production1_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}