package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_201 {
    private final Production49_201 production = new Production49_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}