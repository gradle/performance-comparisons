package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_205 {
    private final Production9_205 production = new Production9_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}