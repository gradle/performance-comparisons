package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_349 {
    private final Production1_349 production = new Production1_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}