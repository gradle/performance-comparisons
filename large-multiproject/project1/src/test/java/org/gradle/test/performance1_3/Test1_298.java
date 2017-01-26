package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_298 {
    private final Production1_298 production = new Production1_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}