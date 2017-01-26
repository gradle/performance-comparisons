package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_152 {
    private final Production1_152 production = new Production1_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}