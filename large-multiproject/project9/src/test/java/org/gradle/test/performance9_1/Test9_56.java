package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_56 {
    private final Production9_56 production = new Production9_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}