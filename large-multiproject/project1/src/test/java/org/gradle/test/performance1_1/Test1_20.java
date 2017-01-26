package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_20 {
    private final Production1_20 production = new Production1_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}