package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_76 {
    private final Production13_76 production = new Production13_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}