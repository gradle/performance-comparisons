package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_256 {
    private final Production1_256 production = new Production1_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}