package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_176 {
    private final Production9_176 production = new Production9_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}