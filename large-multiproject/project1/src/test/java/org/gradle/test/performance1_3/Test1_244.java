package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_244 {
    private final Production1_244 production = new Production1_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}