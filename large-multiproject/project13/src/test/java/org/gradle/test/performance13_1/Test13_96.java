package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_96 {
    private final Production13_96 production = new Production13_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}