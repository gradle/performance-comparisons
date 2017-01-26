package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_334 {
    private final Production1_334 production = new Production1_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}