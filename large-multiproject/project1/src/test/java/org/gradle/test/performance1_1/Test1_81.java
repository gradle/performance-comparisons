package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_81 {
    private final Production1_81 production = new Production1_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}