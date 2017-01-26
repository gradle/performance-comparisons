package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_415 {
    private final Production31_415 production = new Production31_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}