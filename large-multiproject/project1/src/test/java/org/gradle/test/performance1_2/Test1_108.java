package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_108 {
    private final Production1_108 production = new Production1_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}