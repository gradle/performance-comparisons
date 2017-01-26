package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_400 {
    private final Production1_400 production = new Production1_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}