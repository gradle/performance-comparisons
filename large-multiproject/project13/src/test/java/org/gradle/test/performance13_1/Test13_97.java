package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_97 {
    private final Production13_97 production = new Production13_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}