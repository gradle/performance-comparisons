package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_199 {
    private final Production13_199 production = new Production13_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}