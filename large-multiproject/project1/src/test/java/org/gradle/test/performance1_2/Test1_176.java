package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_176 {
    private final Production1_176 production = new Production1_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}