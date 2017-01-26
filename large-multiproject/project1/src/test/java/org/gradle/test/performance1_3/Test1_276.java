package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_276 {
    private final Production1_276 production = new Production1_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}