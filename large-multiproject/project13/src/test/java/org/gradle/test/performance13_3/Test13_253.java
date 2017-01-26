package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_253 {
    private final Production13_253 production = new Production13_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}