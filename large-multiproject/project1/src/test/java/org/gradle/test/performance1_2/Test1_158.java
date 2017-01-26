package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_158 {
    private final Production1_158 production = new Production1_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}