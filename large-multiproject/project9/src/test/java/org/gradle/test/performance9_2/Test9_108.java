package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_108 {
    private final Production9_108 production = new Production9_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}