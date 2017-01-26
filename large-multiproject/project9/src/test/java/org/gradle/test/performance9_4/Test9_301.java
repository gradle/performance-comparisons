package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_301 {
    private final Production9_301 production = new Production9_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}