package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_373 {
    private final Production31_373 production = new Production31_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}