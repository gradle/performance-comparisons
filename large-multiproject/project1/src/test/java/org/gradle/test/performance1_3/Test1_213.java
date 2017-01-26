package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_213 {
    private final Production1_213 production = new Production1_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}