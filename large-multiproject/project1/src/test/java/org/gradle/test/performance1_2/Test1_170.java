package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_170 {
    private final Production1_170 production = new Production1_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}