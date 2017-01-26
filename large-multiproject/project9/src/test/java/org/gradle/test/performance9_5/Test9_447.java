package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_447 {
    private final Production9_447 production = new Production9_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}