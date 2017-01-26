package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_212 {
    private final Production13_212 production = new Production13_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}