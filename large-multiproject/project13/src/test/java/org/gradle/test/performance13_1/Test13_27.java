package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_27 {
    private final Production13_27 production = new Production13_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}