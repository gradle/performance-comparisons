package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_264 {
    private final Production12_264 production = new Production12_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}