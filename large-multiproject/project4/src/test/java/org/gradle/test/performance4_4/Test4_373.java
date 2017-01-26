package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_373 {
    private final Production4_373 production = new Production4_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}