package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_24 {
    private final Production1_24 production = new Production1_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}