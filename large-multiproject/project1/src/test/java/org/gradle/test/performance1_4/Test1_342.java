package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_342 {
    private final Production1_342 production = new Production1_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}