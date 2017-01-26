package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_291 {
    private final Production1_291 production = new Production1_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}