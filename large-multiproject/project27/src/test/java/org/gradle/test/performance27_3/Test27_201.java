package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_201 {
    private final Production27_201 production = new Production27_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}