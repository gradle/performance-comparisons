package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_149 {
    private final Production9_149 production = new Production9_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}