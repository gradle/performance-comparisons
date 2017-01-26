package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_201 {
    private final Production73_201 production = new Production73_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}