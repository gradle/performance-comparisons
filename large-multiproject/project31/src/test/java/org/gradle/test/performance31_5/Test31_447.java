package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_447 {
    private final Production31_447 production = new Production31_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}