package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_201 {
    private final Production30_201 production = new Production30_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}