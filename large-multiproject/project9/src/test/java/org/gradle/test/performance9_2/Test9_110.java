package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_110 {
    private final Production9_110 production = new Production9_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}