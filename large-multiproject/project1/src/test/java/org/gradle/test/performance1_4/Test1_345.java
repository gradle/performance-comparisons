package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_345 {
    private final Production1_345 production = new Production1_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}