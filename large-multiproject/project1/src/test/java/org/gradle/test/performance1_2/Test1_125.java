package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_125 {
    private final Production1_125 production = new Production1_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}