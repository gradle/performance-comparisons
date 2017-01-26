package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_80 {
    private final Production13_80 production = new Production13_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}