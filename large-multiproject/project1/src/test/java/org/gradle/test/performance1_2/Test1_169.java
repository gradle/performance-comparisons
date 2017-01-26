package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_169 {
    private final Production1_169 production = new Production1_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}