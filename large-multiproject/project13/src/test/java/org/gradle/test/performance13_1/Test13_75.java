package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_75 {
    private final Production13_75 production = new Production13_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}