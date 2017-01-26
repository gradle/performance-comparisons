package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_250 {
    private final Production1_250 production = new Production1_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}