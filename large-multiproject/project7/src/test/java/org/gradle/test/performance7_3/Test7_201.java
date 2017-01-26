package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_201 {
    private final Production7_201 production = new Production7_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}