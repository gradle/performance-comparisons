package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_105 {
    private final Production1_105 production = new Production1_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}