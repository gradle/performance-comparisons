package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_244 {
    private final Production9_244 production = new Production9_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}