package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_133 {
    private final Production9_133 production = new Production9_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}