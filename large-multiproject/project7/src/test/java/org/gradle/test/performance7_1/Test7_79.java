package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_79 {
    private final Production7_79 production = new Production7_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}