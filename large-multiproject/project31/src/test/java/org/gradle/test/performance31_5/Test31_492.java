package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_492 {
    private final Production31_492 production = new Production31_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}