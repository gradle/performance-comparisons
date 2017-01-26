package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_341 {
    private final Production1_341 production = new Production1_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}