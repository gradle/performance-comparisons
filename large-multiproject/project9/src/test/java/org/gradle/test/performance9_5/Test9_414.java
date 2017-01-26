package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_414 {
    private final Production9_414 production = new Production9_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}