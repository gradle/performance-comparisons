package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_170 {
    private final Production9_170 production = new Production9_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}