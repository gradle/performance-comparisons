package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_201 {
    private final Production62_201 production = new Production62_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}