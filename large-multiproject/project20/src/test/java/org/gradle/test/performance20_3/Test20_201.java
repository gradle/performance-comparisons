package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_201 {
    private final Production20_201 production = new Production20_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}