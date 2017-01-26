package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_40 {
    private final Production13_40 production = new Production13_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}