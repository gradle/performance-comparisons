package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_167 {
    private final Production13_167 production = new Production13_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}